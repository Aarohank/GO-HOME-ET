import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

public class Space extends JPanel{
    private JFrame myFrame;
    int bordx = 1600;
    int bordy = 900;


    public Space(){
        myFrame = new JFrame("Dot Racing!");
      myFrame.add(this);
      myFrame.setSize(bordx, bordy);
      myFrame.setVisible(true);
      runGame(1,3);

    }


    public void runGame(int speedMult, int numLives){

    }
}