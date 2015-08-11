/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import estructuras.ListaDoble;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import pantallas.objeto;

/**
 *
 * @author AJF
 */
public class crearArchivos {
    public void graficarLista(ListaDoble lista)
    {
        objeto n,temp1=null;
        ListaDoble x=lista;
        objeto primer=(objeto)lista.obtenerInicio();
        objeto ultimo=(objeto)lista.obtenerFin();
        String txt="digraph G\n {\n";
        String img, nombre;
        int contador=1;
        while(!x.esVacia())
        {
            n=(objeto)x.obtenerInicio();
            x.eliminarInicio();
            nombre=n.getNombre();
            img=n.getImgen();
            
            if(temp1!=null)
            {
               txt+="No_"+(contador-1)+"_Nombre_"+temp1.getNombre()+"_Tipo_"+temp1.getImgen()+"->"
                   +"No_"+contador+ "_Nombre_"+nombre+"_Tipo_"+img+";\n";
               txt+="No_"+contador+"_Nombre_"+nombre+"_Tipo_"+img+"->"+
                    "No_"+(contador-1)+  "_Nombre_"+temp1.getNombre()+"_Tipo_"+temp1.getImgen()+";\n";
            }
            contador++;
            temp1=n;
        }
        txt+="No_1_Nombre_"+primer.getNombre()+"_Tipo_"+primer.getImgen()+"->"
                   +"No_"+(contador-1)+ "_Nombre_"+ultimo.getNombre()+"_Tipo_"+ultimo.getImgen()+";\n";
               txt+="No_"+(contador-1)+"_Nombre_"+ultimo.getNombre()+"_Tipo_"+ultimo.getImgen()+"->"+
                    "No_1_Nombre_"+primer.getNombre()+"_Tipo_"+primer.getImgen()+";\n";
        txt+="\n}";
        System.out.println(txt);
            crearFichero(txt,"lista");
    }
    public void crearGraficaMatriz(String t)
    {
        String txt="digraph G\n {\n";
        txt+=t+"\n}";
        crearFichero(txt,"Matriz");
        
    }
    
    public void crearImagen(String nombre)
    {
        //System.out.println(nombre);
        try {
      
      String dotPath = "C:\\Graphviz2.38\\bin\\dot.exe";
      
      String fileInputPath = "C:\\Users\\AJF\\Documents\\graph_"+nombre+".dot";
      String fileOutputPath = "C:\\Users\\AJF\\Documents\\graph_"+nombre+".jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      //ex.printStackTrace();
    } finally {
    }
    }
    
    @SuppressWarnings("empty-statement")
    public void crearFichero(String txt,String nombre)
    {
         File f;
	f = new File("C:\\Users\\AJF\\Documents\\graph_"+nombre+".dot");
	try{
	FileWriter w = new FileWriter(f);
             try (BufferedWriter bw = new BufferedWriter(w); PrintWriter wr = new PrintWriter(bw)) {
                 wr.write(txt);
                 System.out.println("esta escribiendo");
//escribimos en el archivo
                // wr.append(" - y aqui continua"); //concatenamos en el archivo sin borrar lo existente
             }
	}catch(IOException e){System.out.println("no pudo escribir");};
        crearImagen(nombre);
    }
        
}
    

