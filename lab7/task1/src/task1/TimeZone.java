package task1;

import java.awt.Color;
import static java.awt.Color.yellow;
import java.awt.Graphics;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class TimeZone extends JPanel implements Runnable{
    
    public TimeZone(){
    this.setBackground(Color.yellow);
    new Thread(this).start();
    }

    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString(new Date().toLocaleString(), 100, 100);
    }
    @Override
    public void run() {
        while(true){
            try{
            this.repaint();
            Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                Logger.getLogger(TimeZone.class.getName()).log(Level.SEVERE,null,ex);

            }
        }
    
    }
}
