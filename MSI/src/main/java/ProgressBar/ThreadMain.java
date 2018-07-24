package ProgressBar;


public class ThreadMain {

    public static void main(String[] argv) throws Exception{
        ProgressBar pb=new ProgressBar();
        Music mus=new Music();
        pb.bar("Lets start disco ...");
        mus.playSound();

    }
}
