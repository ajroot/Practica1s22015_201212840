/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author AJF
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cabecera matriz=new cabecera(2,4);
        matriz.crearCabecera();
        matriz.insertar(0, 1, "prueba");
        matriz.imprimir();
        matriz.RecorrerDerechaIzquierda();
        matriz.RecorrerIzquierdaDerecha();
    }
    
}
