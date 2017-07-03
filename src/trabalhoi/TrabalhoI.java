/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Christian
 */
public class TrabalhoI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // TODO code application logic here
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        Menu inicio = new Menu(new javax.swing.JFrame(), true);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
        
}
