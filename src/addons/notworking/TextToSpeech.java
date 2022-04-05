package addons.notworking;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import javax.swing.*;

public class TextToSpeech {
    private static final String VOICENAME = "kevin16";

    public TextToSpeech() {
    }

    public void findVoice() {
        VoiceManager voiceManager;
        voiceManager = VoiceManager.getInstance();

        Voice[] voices = voiceManager.getVoices();

        for (Voice voice: voices) {
            System.out.println(voice.getName() + " - " + voice.getDescription());
        }
    }

    public void speak(String textToBeSpoken) {
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice(VOICENAME);

        voice.allocate();

        try {
            voice.speak(textToBeSpoken);
            /*voice.setRate(190);
            voice.setPitch(150);
            voice.setVolume(3); */
        }
        catch (Exception exception) {
            JOptionPane.showConfirmDialog(null,"Can't talk right now. Have errors");
        }
    }

    public static void main(String[] args) {
        TextToSpeech textToSpeech = new TextToSpeech();
        //textToSpeech.findVoice();
        textToSpeech.speak("Test Words");
    }
}
