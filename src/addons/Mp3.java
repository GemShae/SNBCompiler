package addons;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mp3 {
    BufferedInputStream bufferedInputStream;
    FileInputStream fileInputStream;
    Player player;

    public Mp3() {
    }

    public void playMp3(String name) throws JavaLayerException {
        try {
            setSound(name);
        }catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        player = new Player(bufferedInputStream);
        player.play();
    }

    private void setSound(String soundOption) throws FileNotFoundException {
        switch (soundOption) {
            case "welcome" -> {
                fileInputStream = new FileInputStream("audios/welcome.mp3");
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            }
            case "run" -> {
                fileInputStream = new FileInputStream("audios/run.mp3");
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            }
            case "syntax_error" -> {
                fileInputStream = new FileInputStream("audios/syntax_error.mp3");
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            }
            case "run_success" -> {
                fileInputStream = new FileInputStream("audios/run_success.mp3");
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            }
            case "semantic_error" -> {
                fileInputStream = new FileInputStream("audios/semantic_error.mp3");
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            }
            case "goodbye" -> {
                fileInputStream = new FileInputStream("audios/goodbye.mp3");
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            }
            case "lexical_error" -> {
                fileInputStream = new FileInputStream("audios/lexical_error.mp3");
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            }
        }
    }
}
