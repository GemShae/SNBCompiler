package views;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JFrame {
    //Variable Declaration
    private JLabel backgroundImageLabel;
    private JLabel loadingTextLabel;
    private JLabel loadingValue;
    private JProgressBar loadingProgressBar;
    private Thread progressThread;

    public SplashScreen() {
        initialiseComponents();
        addToFrame();
        runningBar();
    }

    private void initialiseComponents() {
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); //Setting location to center of screen
        this.setUndecorated(true); //Removing title bar
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(193,234,242,255));

        backgroundImageLabel = new JLabel();
        backgroundImageLabel.setIcon(new ImageIcon("images/small_logo.png"));
        backgroundImageLabel.setBounds(140,30,600,200);

        loadingValue = new JLabel();
        loadingValue.setBounds(550,350,200,40);
        loadingValue.setForeground(Color.BLACK);
        loadingValue.setFont(new Font("New Times Roman",Font.BOLD,15));

        loadingTextLabel = new JLabel();
        loadingTextLabel.setBounds(20,350,200,40);
        loadingTextLabel.setForeground(Color.BLACK);
        loadingTextLabel.setFont(new Font("New Times Roman",Font.BOLD,15));

        loadingProgressBar = new JProgressBar();
        loadingProgressBar.setMinimum(0);
        loadingProgressBar.setMaximum(100);
        loadingProgressBar.setBounds(100,250,400,40); //Location and size
        loadingProgressBar.setBorderPainted(true);
        loadingProgressBar.setBackground(Color.WHITE);
        loadingProgressBar.setValue(0);

        progressThread = null;
    }

    private void addToFrame() {
        this.add(backgroundImageLabel);
        this.add(loadingProgressBar);
        this.add(loadingValue);
        this.add(loadingTextLabel);
        this.setVisible(true);
    }

    private void runningBar(){
        progressThread = new Thread(() -> {
            for (int index=0; index<=100; index++) {
                loadingProgressBar.setValue(index);
                loadingValue.setText(index + "%");

                if (index==0) {
                    loadingTextLabel.setText("SNB Compiler...");
                }
                if (index==20) {
                    loadingTextLabel.setText("Turning On Modules...");
                }
                if (index==30) {
                    loadingTextLabel.setText("Loading Modules...");
                }
                if (index==50) {
                    loadingTextLabel.setText("Connecting to Server...");
                }
                if (index==70) {
                    loadingTextLabel.setText("Connection Successful...");
                }
                if (index==80) {
                    loadingTextLabel.setText("Launching Application...");
                }
                try {
                    Thread.sleep(90);
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null,exception);
                }
            }
        });
        progressThread.start();
    }
}
