/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author AJF
 */
public class obTablero extends javax.swing.JPanel {

    /**
     * Creates new form obTablero
     */
    String nombre=null;
    String tipo;
    JLabel nuevo;
    public obTablero() {
        initComponents();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        cargarIMG(tipo);
    }

    public JLabel getNuevo() {
        return nuevo;
    }

    public void setNuevo(JLabel nuevo) {
        this.nuevo = nuevo;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }
public void cargarIMG(String nombreIMG)
{
    if(!nombreIMG.equals("nada")&&!nombreIMG.equals(""))
        {
            initComponents();
        //this.nombre=nombre;
        this.tipo=nombreIMG;
        //this.nombreObjeto.setText(nombre);
        //this.labelImagen=imagen;
        //JLabel labelTemporal=new JLabel();
        jLabel1.setSize(50, 50);
        String path="../imagenes/"+nombreIMG+".png";
        System.out.println(path);
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(path));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        this.jLabel1.setIcon(iconoEscalado);
        }
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
