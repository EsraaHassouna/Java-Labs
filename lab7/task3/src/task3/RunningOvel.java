package task3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class RunningOvel extends JPanel implements Runnable {
     
int x=0;
int y=100;
    public RunningOvel(){
    this.setBackground(Color.yellow);
    new Thread(this).start();
    }
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.CYAN);
    g.fillOval(x,y, 50, 50);
    
    }
    @Override
    public void run() {
        while(true){
            try{
                this.repaint();
                Thread.sleep(1000);
                while(x==0 && y==100){
                        x+=20;
                        y-=20;
                    }
                

            
            }
            catch(InterruptedException ex){
                Logger.getLogger(RunningOvel.class.getName()).log(Level.SEVERE,null,ex);

            }
        }
    
    }


    
    
    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
