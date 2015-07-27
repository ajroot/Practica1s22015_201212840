/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201212840;

import javax.swing.JLabel;

/**
 *
 * @author AJF
 */
public class dibujo extends JLabel implements Runnable {
    JLabel imagen=new JLabel();
    String tipo="";
    public dibujo(String nombre,String tipo)
    {
        this.tipo=tipo;
    }

    @Override
    public void run() {
        while (true)
        {
          
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
