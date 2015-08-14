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
        crearHijos();
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
        enlazarHijos();
        enlazarAIzquierda();
    }
    
    public void enlazarHijos()
    {
        nodoCabecera inicio=primero;
        nodoCabecera inicio2=inicio.getSiguiente();
        Nodo pHInicio=inicio.getPrimerHijo();
        Nodo ph2=inicio2.getPrimerHijo();
        while(inicio!=null)
        {
            
           // ph2=inicio2.getPrimerHijo();
            if(inicio2!=null)
            {
                for(int i=0;i<tamanoX;i++)
                {
                    pHInicio.setDerecha(ph2);
                    pHInicio=pHInicio.getAbajo();
                    if(ph2!=null)
                    {
                        ph2=ph2.getAbajo();
                    }
                }
            }
            else
            {
                for(int i=0;i<tamanoX;i++)
                {
                    pHInicio.setDerecha(null);
                    pHInicio=pHInicio.getAbajo();
                    //ph2=ph2.getAbajo();
                }
            }
            inicio=inicio.getSiguiente();
            if(inicio!=null)
            {
                pHInicio=inicio.getPrimerHijo();
            }
            if(inicio2!=null)
            {
                inicio2=inicio2.getSiguiente();
            }
            
        }        
    }
    
    public void enlazarAIzquierda()
    {
        nodoCabecera inicio=ultimo;
        nodoCabecera inicio2=inicio.getAtras();
        Nodo pHInicio=inicio.getPrimerHijo();
        Nodo ph2=inicio2.getPrimerHijo();
        while(inicio!=null)
        {
            
           // ph2=inicio2.getPrimerHijo();
            if(inicio2!=null)
            {
                for(int i=0;i<tamanoX;i++)
                {
                    pHInicio.setIzquierda(ph2);
                    pHInicio=pHInicio.getAbajo();
                    if(ph2!=null)
                    {
                        ph2=ph2.getAbajo();
                    }
                }
            }
            else
            {
                for(int i=0;i<tamanoX;i++)
                {
                    pHInicio.setIzquierda(null);
                    pHInicio=pHInicio.getAbajo();
                    //ph2=ph2.getAbajo();
                }
            }
            inicio=inicio.getAtras();
            if(inicio!=null)
            {
                pHInicio=inicio.getPrimerHijo();
            }
            if(inicio2!=null)
            {
                inicio2=inicio2.getAtras();
            }
            
        }
    }
    
    public void insertar(int posX,int posY,Object dato)
    {
        nodoCabecera inicio=primero;
        while(primero!=null)
        {
            
        }
    }
}
