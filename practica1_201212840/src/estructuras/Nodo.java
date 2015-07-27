/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author AJF
 */
    public class Nodo
{
	Nodo siguiente,anterior;
	Object dato;
	public Nodo(Nodo anterior,Object dato,Nodo siguiente)
	{
		this.anterior=anterior;
		this.dato=dato;
		this.siguiente=siguiente;
	}
	
	public void setDato(Object dato)
	{
		this.dato=dato;
	}
	public Object getDato()
	{
		return dato;
	}
	
	public void setSiguiente(Nodo siguiente)
	{
		this.siguiente=siguiente;
	}
	
	public Nodo getSiguiente()
	{
		return this.siguiente;
	}
	
	public void setAnterior(Nodo anterior)
	{
		this.anterior=anterior;
	}
	public Nodo getAnterior()
	{
		return this.anterior;
	}
}


