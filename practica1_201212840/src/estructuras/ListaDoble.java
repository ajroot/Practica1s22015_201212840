/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import pantallas.objeto;

/**
 *
 * @author AJF
 */
public class ListaDoble
{
    String nombre="";
    Nodo primero,ultimo;
    public ListaDoble(String nombre)
    {
            this.nombre=nombre;
            this.primero=null;
            this.ultimo=null;
    }
    public ListaDoble()
    {
            this.primero=null;
            this.ultimo=null;
    }
    public String getNombre(){
            return this.nombre;
    }

    public void insertarInicio(Object dato)
    {
            if(primero==null)
            {
                    this.primero=this.ultimo=new Nodo(null,dato,null);
            }
            else
            {
                    Nodo temporal=new Nodo(null,dato,primero);
                    primero.setAnterior(temporal);
                    primero=temporal;
            }
    }
    public void insertarFin(Object dato)
    {
            if(primero==null)
            {
                    this.primero=this.ultimo=new Nodo(null,dato,null);
            }
            else
            {
                    Nodo temporal=new Nodo(ultimo,dato,null);
                    ultimo.setSiguiente(temporal);
                    ultimo=temporal;
            }
    }

    public void eliminarInicio()
    {
            Nodo temporal;
            if(primero!=null)
            {
                    temporal=primero;
                    primero=primero.getSiguiente();
                    if(primero!=null)
                    {
                            primero.setAnterior(null);
                    }
            }
    }

    public Object obtenerInicio()
    {
            if(primero!=null)
            {
                    return primero.getDato();
            }
            return null;
    }

    public void eliminarFin()
    {
            Nodo temporal;
            if(primero!=null)
            {
                    temporal=ultimo;
                    ultimo=ultimo.getAnterior();
                    if(ultimo!=null)
                    {
                            ultimo.setSiguiente(null);
                    }
                    else
                    {
                        primero=ultimo=null;
                    }
            }
    }
    public Object obtenerFin()
    {
        if(ultimo!=null)
        {
            return ultimo.getDato();
        }
        return null;
    }

    public void mostrar()
    {
            Nodo temp=primero;
            while(temp!=null)
            {
                    System.out.println(String.valueOf(temp.getDato()));
                    temp=temp.getSiguiente();
            }
    }
    public void mostrarAtras()
    {
            Nodo temp=ultimo;
            while(temp!=null)
            {
                    System.out.println(String.valueOf(temp.getDato()));
                    temp=temp.getAnterior();
            }
    }
    
    public int buscarPosicion(Object dt)
    {
        Nodo aRecorrer=primero;
        int pos=0;
        while(aRecorrer!=null)
        {
            if(dt==aRecorrer.getDato())
            {
                return pos;
            }
            pos++;
            aRecorrer=aRecorrer.getSiguiente();
        }
        return pos;
    }
public boolean modificar(Object dt,Object nuevo)
    {
        Nodo aRecorrer=primero;
        while(aRecorrer!=null)
        {
            if(dt==aRecorrer.getDato())
            {
                aRecorrer.setDato(nuevo);
                return true;
            }
            aRecorrer=aRecorrer.getSiguiente();
        }
        return false;
    }
public boolean esVacia()    
{
    if(primero!=null)
    {
        return false;
    }
    return true;
}
public void vaciar()
{
    primero=ultimo=null;
}

public String estadistica()
{
    Nodo temporal=primero;
    int bloque=0, hongo=0,moneda=0,tortuga=0, castillo=0,principal=0;
    String nombre="";
    objeto x;
    while(temporal!=null)
    {
        x=(objeto)temporal.getDato();
        nombre=x.getImgen();
        if(nombre.equals("hongo"))
        {
            hongo++;
        }
        else if(nombre.equals("bloque"))
        {
            bloque++;
        }
        else if(nombre.equals("moneda"))
        {
            moneda++;
        }
        else if(nombre.equals("tortuga"))
        {
            tortuga++;
        }
        else if(nombre.equals("principal"))
        {
            principal++;
        }
        else if(nombre.equals("castillo"))
        {
            castillo++;
        }
        temporal=temporal.getSiguiente();
    }
    return "Se ecuentra lo siguiente: \n hongos: "+hongo+"\n bloques: "+bloque+"\n monedas: "+moneda+"\n tortugas: "+tortuga
            +"\n Personaje Principal: principal"+"\n Castillo: "+castillo;
}
}