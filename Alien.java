import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Alien{
    public int round;
    public int ams;
    public int Axpos;
    public int Aypos;
    public int size;
    public boolean mfd;
    
    
    public Alien(int m, int x, int y, int sz, boolean l){
        ams = m;
        Axpos = x;
        Aypos = y;        
        size = sz;
        mfd = l;
    }

    public int getAxpos(){
        return Axpos;
    } 
    
    public int getAypos(){
        return Aypos;
    } 
    
    public int getSize(){
        return size;
    }

    public void setAxpos(int d){
        Axpos += d;
    }

    public void setAypos(int d){
        Aypos += d;
    }
    // public Graphics ag = space.get

    public boolean getMFD(){
        return mfd;
    }

    public void MarkForD(boolean l){
        mfd = l;
    }


}