package task2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Text extends JPanel implements Runnable{
int x=0;
    public Text(){
    this.setBackground(Color.yellow);
    new Thread(this).start();
    }

    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString("Hello", x, 150);
    
    }
    @Override
    public void run() {
        while(true){
            try{
            this.repaint();
            Thread.sleep(1000);
            x+=20;
            while(x==400){
            x=0;}
            }
            catch(InterruptedException ex){
                Logger.getLogger(Text.class.getName()).log(Level.SEVERE,null,ex);

            }
        }
    
    }


    
    
    

    
}
