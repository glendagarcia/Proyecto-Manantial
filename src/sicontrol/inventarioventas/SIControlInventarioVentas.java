/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sicontrol.inventarioventas;

import Views.Sistema;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



/**
 *
 * @author jeanm
 */
public class SIControlInventarioVentas {
    //Clase para ejecutar el formulario principal

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
           
        } 
         Sistema sistema = new Sistema();//Se instancia el objeto Sistema para poder usar los siguientes metodos:
         sistema.setExtendedState(MAXIMIZED_BOTH);//Abarca todo el espacio de la pantalla
         sistema.setVisible(true);//Ejecuta el formulario de una vez
    }
    
}
