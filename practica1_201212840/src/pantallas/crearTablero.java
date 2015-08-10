/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import estructuras.ListaDoble;
//import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author AJF
 */
public class crearTablero extends javax.swing.JFrame {

    /**
     * Creates new form crearTablero
     */
    ListaDoble listaObjetos;
    public crearTablero() {
        initComponents();
        
    }
    boolean pila;
    public void carga(ListaDoble objetos, boolean p)
    {
        this.listaObjetos=objetos;
        this.pila=p;
        panelTablero.setLayout(new GridLayout(4,3));
        cargarSiguiente();
        //eliminar();
        
       llenarLabels();
    }
    
    objeto obTemporal;
    ListaDoble rechazados=new ListaDoble("Objetos rechazados");
    public void cargarSiguiente()
    {
        //if(!listaObjetos.esVacia())
        {
            if(pila)
            {
                obTemporal=(objeto)listaObjetos.obtenerFin();
                listaObjetos.eliminarFin();
            }
            else
            {
                obTemporal=(objeto)listaObjetos.obtenerInicio();
                listaObjetos.eliminarInicio();
            }
            cargarObjeto();
        }
        //else
        {
            //panelTablero.setEnabled(false);
        }
                
        
    }
    
    public void eliminar()
    {
        if(pila)
            {
                //obTemporal=(objeto)listaObjetos.obtenerFin();
                listaObjetos.eliminarFin();
            }
            else
            {
               // obTemporal=(objeto)listaObjetos.obtenerInicio();
                listaObjetos.eliminarInicio();
            }
    }
    private void llenarLabels()
    {
        JLabel nuevo;
        int tamano=tamX*tamY;
        for(int i=0;i<tamano;i++)
        {
            {
                nuevo=new JLabel(String.valueOf(i));
                
                panelTablero.add(nuevo, i);
            }
        }
    }
    boolean termino=false;
    JLabel temporal=new JLabel();
    public void cargarObjeto()
    {
        //this.nombreObjeto.setText(nombre);
        //this.labelImagen=imagen;
        //JLabel labelTemporal=new JLabel();
        try
        {
            //File n=new File("../imagenes/"+obTemporal.getImgen()+".png");
            //if(n.exists())
            {
                imgSiguiente.setSize(50, 50);
            String path="../imagenes/"+obTemporal.getImgen()+".png";
            if(path.equals("../imagenes/.png"))
            {
                path="../imagenes/nada.png";
            }
            ImageIcon imgIcon = new ImageIcon(getClass().getResource(path));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            this.imgSiguiente.setIcon(iconoEscalado);
            this.temporal=new JLabel();
            this.temporal.setIcon(iconoEscalado);
            this.nombreSiguiente.setText(obTemporal.getNombre());
            }
            
        }
        finally
        {
            
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
        imgSiguiente = new javax.swing.JLabel();
        nombreSiguiente = new javax.swing.JLabel();
        panelTablero = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Figura Siguiente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        imgSiguiente.setText("jLabel2");
        getContentPane().add(imgSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 50, 50));

        nombreSiguiente.setText("jLabel3");
        getContentPane().add(nombreSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        panelTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTableroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTableroMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        getContentPane().add(panelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 490, 330));

        jButton1.setText("Agregar Columna");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButton2.setText("Agregar Fila");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jButton3.setText("Informacion");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jButton4.setText("Descartar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,listaObjetos.estadistica(), "Reporte de Objetos Restantes",JOptionPane.DEFAULT_OPTION);
//listaObjetos.estadistica();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
//        if(!listaObjetos.esVacia())
        {
            //rechazados.insertarFin(obTemporal);
            if(pila)
            {
                listaObjetos.insertarInicio(obTemporal);
            }
            else
            {
                listaObjetos.insertarFin(obTemporal);
            }
            cargarSiguiente(); 
            
        }
    }//GEN-LAST:event_jButton4MouseClicked

    int tamX=4;
    int tamY=3;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        tamX++;
        this.panelTablero.setLayout(null);
        this.panelTablero.setLayout(new GridLayout(tamX,tamY));
        for(int i=0;i<tamY;i++)
        {
             JLabel nuevo=new JLabel (String.valueOf(((tamX-1)*tamY)+i));
        this.panelTablero.add(nuevo);
            
        }
       
        this.panelTablero.repaint();
        this.pack();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        tamY++;
        this.panelTablero.setLayout(new GridLayout(tamX,tamY));
        for(int i=0;i<tamX;i++)
        {
             JLabel nuevo=new JLabel (String.valueOf(((tamY-1)*tamX)+i));
        this.panelTablero.add(nuevo);
            
        }
        this.panelTablero.repaint();
        this.pack();
        
    }//GEN-LAST:event_jButton2MouseClicked

    /*int tX=50;
    int tY=50;*/
    private void panelTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTableroMouseClicked
        // TODO add your handling code here:
        if(!listaObjetos.esVacia())
        {
            cargarATablero();
    //        eliminar();
        }
        else
        {
            if(termino==false)
            {
                    objeto n=new objeto("vacio","nada");
        if(pila)
        {
            listaObjetos.insertarInicio(n);
        }
        else
        {
            listaObjetos.insertarFin(n);
        }
        termino=true;
            }
            
        }
       
    }//GEN-LAST:event_panelTableroMouseClicked

    
    public void cargarATablero()
    {
        int x=panelTablero.getComponentZOrder(panelTablero.getComponentAt(panelTablero.getMousePosition()));
       JLabel n=(JLabel)this.panelTablero.getComponent(x);
      /* tX=n.getX();
       tY=n.getY();*/
       JOptionPane.showMessageDialog(this,x,String.valueOf(x),JOptionPane.ERROR_MESSAGE);
       panelTablero.remove(x);
       panelTablero.add(temporal, x);
       this.panelTablero.setLayout(new GridLayout(tamX,tamY));
       cargarSiguiente();
       panelTablero.repaint();
       this.pack();
    }
    private void panelTableroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTableroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelTableroMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crearTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel nombreSiguiente;
    private javax.swing.JPanel panelTablero;
    // End of variables declaration//GEN-END:variables
}
