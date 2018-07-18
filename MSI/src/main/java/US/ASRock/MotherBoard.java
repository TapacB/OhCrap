package US.ASRock;


import US.ASRock.helpers.BDConnect;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static US.ASRock.helpers.FileUtils.getConfig;

public class MotherBoard extends JFrame {


     private JPanel jPanel = new JPanel();
     private BDConnect bd=new BDConnect();



    public ArrayList<String> getTextFromFile(){
        InputStream in = getClass().getResourceAsStream("/mb.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        ArrayList<String> list = new ArrayList<>();
        try {
            String line;
            while (null != (line = reader.readLine())) {
                list.add(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }



    public MotherBoard() {
        super("MotherBoard");
        GridLayout layout = new GridLayout(3,2, 300, 300);
        jPanel.setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("mb.txt").getFile());
        jPanel.add(new JLabel(""+file)).setLocation(1,1);
        jPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("cpu.png")))).setLocation(1,2);
        jPanel.add(new JLabel(""+getTextFromFile())).setLocation(2,2);
        jPanel.add(new JLabel("dsgdfher"));
        setContentPane(jPanel);
        pack();
        setVisible(true);
    }



    public static void main(String[] args){
        try{
        getConfig();}
        catch (Exception e){
            e.printStackTrace();
        }
        MotherBoard mb=new MotherBoard();
        mb.setVisible(true);
    }





}
