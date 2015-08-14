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
public class nodoCabecera {
    nodoCabecera atras;
    nodoCabecera siguiente;
    String nombre;
    Nodo primerHijo;
    Nodo ultimoHijo;
    int x;
    int y=0;

    public nodoCabecera(nodoCabecera at,nodoCabecera sig,int X,Nodo pH,Nodo uH)
    {
        this.atras=at;
        this.siguiente=sig;
       // this.nombre=nombre;
        this.x=X;
        this.primerHijo=pH;
        this.ultimoHijo=uH;
    }
    public void setPrimerHijo(Nodo pH)
    {
        this.primerHijo=pH;
    }
    public void setUltimoHijo(Nodo uH)
    {
        this.ultimoHijo=uH;
    }
    public Nodo getUltimoHijo()
    {
        return this.ultimoHijo;
    }
    public Nodo getPrimerHijo()
    {
        return this.primerHijo;
    }
    public nodoCabecera getAtras() {
        return atras;
    }

    public void setAtras(nodoCabecera atras) {
        this.atras = atras;
    }

    public nodoCabecera getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoCabecera siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
            
    
}
