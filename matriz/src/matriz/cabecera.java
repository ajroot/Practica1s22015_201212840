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
public class cabecera {
    
    String nombre;
    nodoCabecera primero;
    nodoCabecera ultimo;
    int tamanoX;
    int tamanoY;
    public cabecera(String n,int x,int y)
    {
        this.nombre=n;
        this.tamanoX=x;
        this.tamanoY=y;
    }
    public cabecera(int x,int y)
    {
        this.tamanoX=x;
        this.tamanoY=y;
    }
    public void crearCabecera()
    {
        primero=ultimo=new nodoCabecera(null,null,0,null,null);
        nodoCabecera temp;
        for(int i=0;i<tamanoX;i++)
        {
           temp=new nodoCabecera(ultimo,null,i,null,null);
           ultimo.setSiguiente(temp);
           ultimo=temp;
        }
    }
    void crearHijos()
    {
        nodoCabecera temp=primero;
        Nodo h;
        Nodo temporal;
        int contador=0;
        while(temp!=null)
        {
            h=new Nodo(null,temp,null,null,null,contador,0);
            temp.setPrimerHijo(h);
            temp.setUltimoHijo(h);
            for(int j=1;j<tamanoY;j++)
            {
                temporal=new Nodo(null,temp.getUltimoHijo(),null,null,null,contador,j);
                temp.getUltimoHijo().setAbajo(temporal);
                temp.setUltimoHijo(temporal);
            }
            contador++;
           temp=temp.getSiguiente();
        }
    }
}
