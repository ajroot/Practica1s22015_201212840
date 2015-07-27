/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201212840;

import estructuras.ListaDoble;

/**
 *
 * @author AJF
 */
public class Practica1_201212840 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble a=new ListaDoble("lista prueba");
        a.insertarInicio(1);
        a.insertarInicio(2);
        a.insertarInicio(3);
        a.insertarFin(12);
        a.insertarFin(14);
        a.modificar(2, 22);
        //a.eliminarFin();
        //a.eliminarInicio();
        a.mostrar();
        System.out.println("Ahora alrevez");
        a.mostrarAtras();
    }
    
}
