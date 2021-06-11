/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.launcher;


import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.gui.MessagingReceiverGui;
import org.emp.gl.gui.MessagingSenderGui;
import org.emp.gl.sender.service.MessagingService;
import org.emp.gl.sender.service.impl.MessagingServiceImpl;

/**
 *
 * @author billal
 */
public class Launcher {

    static {
        // initialisation du Lookup 
        Lookup.getInstance().register(MessagingService.class, new MessagingServiceImpl() ); 


        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessagingSenderGui("ID-0").setVisible(true);
                new MessagingReceiverGui("ID-1").setVisible(true);
                //new MessagingReceiverGui("ID-2").setVisible(true);
                //new MessagingReceiverGui("ID-3").setVisible(true);
            }
        });
    }

}
