package ProgressBar;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.IOException;

import static com.sun.org.apache.xalan.internal.utils.SecuritySupport.getResourceAsStream;

public class ProgressBar extends Thread{
    private String bar="-";

    protected synchronized void bar(String msg) throws IOException{
        System.out.println(msg);
         new Thread(new Runnable() {

            @Override
            public  void run() {
                try {
                    int j=0;
                    for(int i=0; i<Long.MAX_VALUE; i++) {
                        if(i%150000000==0 && j<100){
                            j++;
                           System.out.print("\r|"+j+"%|"+bar);
                           bar +="-";
                        } else if(j>=100){
                            break;
                        }
                    }
                    System.out.write("| Done \r\n".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();

            }}
        }).start();
    }




}
