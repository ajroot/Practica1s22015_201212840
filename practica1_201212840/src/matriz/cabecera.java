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
        for(int i=1;i<tamanoX;i++)
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
        //enlazarHijos();
        enlazarDerecha();
        enlazarIzquierda();
        //enlazarAIzquierda();
    }
    public void enlazarDerecha()
    {
        nodoCabecera recorrer=primero,siguiente;
        Nodo primer,segundo=null;
        Nodo r2;
        while(recorrer!=null)
        {
            primer=recorrer.getPrimerHijo();
            siguiente=recorrer.getSiguiente();
            if(siguiente!=null)
            {
                segundo=recorrer.getSiguiente().getPrimerHijo();
            }
            r2=primer;
            while(r2!=null)
            {
                r2.setDerecha(segundo);
                if(segundo!=null)
                {
                    segundo=segundo.getAbajo();
                }
                r2=r2.getAbajo();
            }
            recorrer=recorrer.siguiente;
        }
    }
   private void enlazarIzquierda()
    {
        nodoCabecera recorrer=ultimo,siguiente;
        Nodo primer,segundo=null;
        Nodo r2;
        while(recorrer!=null)
        {
            primer=recorrer.getPrimerHijo();
            siguiente=recorrer.getAtras();
            if(siguiente!=null)
            {
                segundo=recorrer.getAtras().getPrimerHijo();
            }
            r2=primer;
            while(r2!=null)
            {
                r2.setIzquierda(segundo);
                if(segundo!=null)
                {
                    segundo=segundo.getAbajo();
                }
                r2=r2.getAbajo();
            }
            recorrer=recorrer.atras;
        }
    }
    
    public boolean insertar(int posX,int posY,Object dato)
    {
        nodoCabecera inicio=primero;
        Nodo temp;
        while(inicio!=null)
        {
            if(inicio.getX()==posX)
            {
                temp=inicio.getPrimerHijo();
                while(temp!=null)
                {
                    if(temp.getY()==posY)
                    {
                        temp.setDato(dato);
                        return true;
                    }
                    temp=temp.getAbajo();
                }
            }
            inicio=inicio.getSiguiente();
        }
        return false;
    }
    
    public String imprimir()
    {
        nodoCabecera inicio=primero;
        Nodo temp;
        String txtCabecera="";
        String txtNodos="";
        while(inicio!=null)
        {
            txtCabecera+=inicio.getX()+"->";
                temp=inicio.getPrimerHijo();
                txtNodos+=temp.getX();
                while(temp!=null)
                {
                    txtNodos+="->pos"+temp.getX()+temp.getY()+String.valueOf(temp.getDato());
                    temp=temp.getAbajo();
                    
                }
            txtNodos+=";\n";
            inicio=inicio.getSiguiente();
        }
        txtCabecera+="null;";
        System.out.println(txtCabecera);
        System.out.println(txtNodos);
        return txtCabecera+"\n"+txtNodos;
    }
    
    public String RecorrerDerechaIzquierda()
    {
        nodoCabecera inicio=primero;
        Nodo temp=inicio.getPrimerHijo();
        Nodo temp2;
        String texto="";
        int contador=0;
        while(temp!=null)
        {
            temp2=temp;
            while(temp2!=null)
            {
                //System.out.println(contador);
                texto+="pos"+String.valueOf(temp2.getX())+""+String.valueOf(temp2.getY())+""+String.valueOf(temp2.getDato())+"->";
                temp2=temp2.getDerecha();
                contador++;
            }
            texto+="null; \n";
            temp=temp.getAbajo();
        }
        System.out.println(texto);
        return texto;
    }
    public String RecorrerIzquierdaDerecha()
    {
        nodoCabecera inicio=ultimo;
        Nodo temp=inicio.getPrimerHijo();
        Nodo temp2;
        String texto="";
        int contador=0;
        while(temp!=null)
        {
            temp2=temp;
            while(temp2!=null)
            {
                //System.out.println(contador);
                texto+="pos"+String.valueOf(temp2.getX())+""+String.valueOf(temp2.getY())+""+String.valueOf(temp2.getDato())+"->";
                temp2=temp2.getIzquierda();
                contador++;
            }
            texto+="null;\n";
            temp=temp.getAbajo();
        }
        System.out.println(texto);
        return texto;
    }
}
