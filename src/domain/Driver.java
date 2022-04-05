package domain;

import views.MainApplication;
import views.SplashScreen;

import java.awt.*;

public class Driver {
    public static void main(String[] args) throws Exception{
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);
        Thread.sleep(10000);
        splashScreen.dispose();
        EventQueue.invokeLater(() -> new MainApplication("SNB Compiler").setVisible(true));
    }
}
