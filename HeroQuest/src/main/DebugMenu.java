/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author Matthew
 */
public class DebugMenu extends Menu {
    public DebugMenu() {        
        this.setMenucode(5);
        this.setLayout(new GridLayout(0,1,10,10));

                       
        this.setVisible(false);
    }
}
