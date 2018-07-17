package US.ASRock;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;


public class MotherBoard extends JFrame {


     
     private JPanel jPanel = new JPanel();
//     JPanel jPanel3 = new JPanel();
//     JPanel jPanel4 = new JPanel();




    public MotherBoard() {
        super("MotherBoard");
        GridLayout layout = new GridLayout(3,2, 300, 300);
        jPanel.setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel.add(new JLabel("123")).setLocation(1,1);
        jPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("cpu.png")))).setLocation(1,2);
        jPanel.add(new JLabel("asfas")).setLocation(2,2);
        jPanel.add(new JLabel("dsgdfher"));
        setContentPane(jPanel);
        pack();
        setVisible(true);
    }



    public static void main(String[] args){
        MotherBoard mb=new MotherBoard();
        mb.setVisible(true);
    }





}
