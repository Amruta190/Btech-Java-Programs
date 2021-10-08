
import javax.swing.*;
import java.awt.*;

public class scroll extends JApplet implements Runnable{
  int x;
  public void init(){
    Thread r1 = new Thread(this);
    r1.start();
  }
  public void run(){
    while(true){
      x = 50;
      try{
        for(; x <= 150; x += 10){
          repaint();
          Thread.sleep(250);
        }
        for(; x >= 100; x -= 10){
          repaint();
          Thread.sleep(250);
        }
      }catch(Exception e){
        System.out.println(e);
      }
    }
  }

  public void paint(Graphics g){
    super.paint(g);
    g.drawString("Welcome", x, 100);
  }
}