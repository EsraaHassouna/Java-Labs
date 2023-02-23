/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import javax.swing.JFrame;

/**
 *
 * @author sheha
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame example = new JFrame();
        RunningOvel mp=new RunningOvel();
        example.setContentPane(mp);
        example.setSize(300, 300);
        example.setVisible(true);
    }
    
}
