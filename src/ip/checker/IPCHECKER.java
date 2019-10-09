/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.checker;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import javax.swing.UIManager;
import javax.swing.*;
/**
 *
 * @author aldi
 */
public class IPCHECKER {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new AeroLookAndFeel());
            new jfmUtama().setVisible(true);   
        }      
        catch(Exception Ex){
            JOptionPane.showMessageDialog(null, "Error : " + Ex);
        }
    }
    
}
