import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Bullet {
    private int speed;
    private int BXpos;
    private int BYpos;
    private int Tick;
    public ArrayList<Bullet> Mag = new ArrayList<Bullet>();


    public Bullet(int s, int x, int y){
        speed = s;
        BXpos = x;
        BYpos = y;
    }
    
    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(1000); //milliseconds
        } catch(Exception e){

        }
    }

    public void createBullet(int x, int y){
        Mag.add(new Bullet(48, x, y));
    }

    public ArrayList<Bullet> getArrayList(){
        return Mag;
    }

    public int getSpeed(){
        return speed;
    }

    public int getBXpos(){
        return BXpos;
    }

    public int getBYpos(){
        return BYpos;
    }

    public void setBYpos(int i){
        BYpos += i;
    }
    
}
