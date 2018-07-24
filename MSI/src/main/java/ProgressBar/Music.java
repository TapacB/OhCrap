package ProgressBar;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;



import java.io.*;


public class Music extends Thread {


    protected  synchronized void playSound(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                play();
            }
        }).start();
    }

    public void play(){
        try{
            InputStream in = new FileInputStream("MSI/src/main/resources/Super Mario Bros.wav");
            AudioStream as = new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
