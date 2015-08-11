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
public class Nodo {
    Nodo derecha;
    Nodo izquierda;
    Nodo abajo;
    Nodo arriba;
    nodoCabecera nodoPadre;
    int x;
    int y;
    Object dato;
     
    public Nodo(Nodo izquierda,Nodo arriba,Nodo derecha,Nodo abajo,Object dato,int x,int y)
    {
        this.derecha=derecha;
        this.izquierda=izquierda;
        this.arriba=arriba;
        nodoPadre=null;
        this.abajo=abajo;
        this.dato=dato;
        this.x=x;
        this.y=y;
    }
    public Nodo(Nodo izquierda,nodoCabecera padre,Nodo derecha,Nodo abajo,Object dato,int x,int y)
    {
        this.derecha=derecha;
        this.izquierda=izquierda;
        this.arriba=null;
        this.nodoPadre=padre;
        this.abajo=abajo;
        this.dato=dato;
        this.x=x;
        this.y=y;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }

    public Nodo getArriba() {
        return arriba;
    }

    public void setArriba(Nodo arriba) {
        this.arriba = arriba;
    }

    public nodoCabecera getNodoPadre() {
        return nodoPadre;
    }

    public void setNodoPadre(nodoCabecera nodoPadre) {
        this.nodoPadre = nodoPadre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
            
    
}
