/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import ChecksBus.Empresa;
import ChecksBus.Funcionario;
import ChecksBus.Itinerario;
import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


/**
 *Clase Archivo que maneja los datos y archivos .txt para su almacenamiento de las clases Funcionario e Itinerario
 * @author ChecksBus
 */

public class Archivo {
    private String ruta_txt;
   
    /**
     *
     * @param ruta_txt
     */
    public Archivo(String ruta_txt){
        this.ruta_txt = ruta_txt;
    }

    /**
     *
     */
    public Archivo(){
        
    }

    /**
     *
     * @return
     */
    public String getRuta_txt() {
        return ruta_txt;
    }

    /**
     *
     * @param ruta_txt
     */
    public void setRuta_txt(String ruta_txt) {
        this.ruta_txt = ruta_txt;
    }
    
    
    
    
    
 /** 
  *Este metodo carga el txt del itinerario con la ruta del archivo, instancia un itinerario, agrega sus atributos 
  * que esta en el archivo, y lo guarda en la empresa
     * @param empresa Tipo Empresa
  **/
 public void cargar_Itinerario_txt(Empresa empresa){
        try{
            RandomAccessFile arch = new RandomAccessFile(ruta_txt,"rw");

                String linea = null;
                while((linea = arch.readLine())!=null){
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    Itinerario itinerario = new Itinerario();
                    itinerario.bus.setCodigo(Integer.parseInt(st.nextToken()));
                    itinerario.setOrigen(st.nextToken());
                    itinerario.setDestino(st.nextToken());
                    itinerario.setHoraLlegada(st.nextToken());
                    itinerario.setHoraSalida(st.nextToken());
                    itinerario.setFecha(st.nextToken());
                    itinerario.getBus().setEstado(st.nextToken());
                    empresa.agregarRegistroItinerario(itinerario);
            }
        }catch(IOException | NumberFormatException ex){
            mensaje("Error al cargar archivo: "+ex.getMessage());
        }
    }

 
 
    /**
     *Este metodo carga el txt del funcionario con la ruta del archivo, instancia un funcionario, agrega sus atributos 
     * @param empresa Tipo Empresa
     */
    public void cargar_Funcionario_txt(Empresa empresa){
        
        try{
            RandomAccessFile arch = new RandomAccessFile(ruta_txt,"rw");
//             try (BufferedReader bu = new BufferedReader(new FileReader(new File(ruta_txt)))) {
                 
               String linea = null;
                while((linea = arch.readLine())!=null){
                  StringTokenizer st = new StringTokenizer(linea, ",");
                  Funcionario funcionario = new Funcionario(); 
                  funcionario.setIdentificadorAleatorio(Integer.parseInt(st.nextToken()));
                  funcionario.setNombre(st.nextToken());
                  funcionario.setApellido(st.nextToken());
                  funcionario.setNombreusuario(st.nextToken().trim());
                  funcionario.setContrasena(st.nextToken().trim());
                  funcionario.setRol(Integer.parseInt(st.nextToken().trim()));
                  empresa.agregarRegistroFuncionario(funcionario);
//                }  
             }
        }catch(IOException | NumberFormatException ex){ 
        }
    }
    
    
    
    /** 
     *Este metodo guardar en el archivo .txt el itinerario que lo recibe como parámetro, y tambien el objeto de tipo Empresa
     * para guardarlo en el ArrayList de Itinerario que esta en el misma.
     * @param itinerario Tipo Itinerario
     * @param empresa Tipo Empresa
     **/
    public void grabar_Itinerario_txt(Itinerario itinerario, Empresa empresa){
        FileWriter fw;
        PrintWriter pw;
        try{
            
            fw = new FileWriter(ruta_txt);
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < empresa.cantidadRegistroItinerario(); i++){
                itinerario = empresa.obtenerRegistroItinerario(i);
                pw.println(itinerario.toString());
            }
             pw.close();
            
        }catch(IOException ex){

        }
    }

    
    
    
    /**
     *Este metodo guarda en el archivo .txt el funionario que lo recibe como parámetro, y tambien el objeto de tipo Empresa
     *para guardarlo en el ArrayList de Funcionario que esta en el misma.
     * @param funcionario Tipo Funcionario
     * @param empresa Tipo Empresa
     */
    public void grabar_Funcionario_txt(Funcionario funcionario, Empresa empresa){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(ruta_txt);
            pw = new PrintWriter(fw);
             
            for(int i = 0; i < empresa.cantidadRegistroFuncionario(); i++){
                funcionario = empresa.obtenerRegistroFuncionario(i);
                pw.println(String.valueOf(funcionario.toString()));
            }
             pw.close();
            
        }catch(IOException ex){

        }
    }
    
    
    
    
    
    
    /**
     *Este metodo utiliza un objeto String texto para mostrar un cuadro de mensaje en pantalla con un JOptionPane
     * @param texto Tipo String. Texto que se quiere mostrar
     **/
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    
    
    
    
    /** 
     *Este método modifica aun objeto Itinerario recibiendo sus atributos como String, los que modifico del objeto y los que 
     * no modifico, y con ellos instanciando un nuevo objeto Itinerario para volver guardarlo en el .txt con el método guardar_txt sobreescribir el Itinerario modificado por 
     * Itinerario sin modificar.
     * @param codigo Tipo int
     * @param origen Tipo String
     * @param destino Tipo String
     * @param horaLlegada Tipo String
     * @param horaSalida Tipo String
     * @param fecha Tipo String
     * @param estado Tipo String
     * @param empresa Tipo Empresa
     **/
    public void modificarRegistroItinerario(int codigo, String origen, String destino, String horaLlegada, String horaSalida
            ,String fecha, String estado, Empresa empresa){
        try{
            if(codigo == -1 && codigo>=0)mensaje("Ingresar codigo");
            else if(origen == null)mensaje("Ingresar Origen");
            else if(destino == null) mensaje("Ingresar Destino");
            else if(horaLlegada == null)mensaje("Ingresar hora de llegada");
            else if(horaSalida == null)mensaje("Ingresar hora de salida");
            else{
                int codigo1 = empresa.buscaCodigoItinerario(codigo);
                Itinerario itinerario = new Itinerario(codigo, origen, destino, horaLlegada, horaSalida, fecha, estado);
                if(codigo1 == -1)empresa.agregarRegistroItinerario(itinerario);
                else empresa.modificarRegistroItinerario(codigo1, itinerario);
                grabar_Itinerario_txt(itinerario,empresa);

           }
        }catch(Exception ex){
            
        }
    }
    
    
    
    
    
    
    
    /** 
     *Este método modifica aun objeto Itinerario recibiendo sus atributos como String, los que modifico del objeto y los que 
     * no modifico, y con ellos instanciando un nuevo objeto Itinerario para volver guardarlo en el .txt con el método guardar_txt sobreescribir el Itinerario modificado por 
     * Itinerario sin modificar.
     * @param codigo tipo int
     * @param funcionario tipo Funcionario
     * @param empresa Tipo Empresa
     **/
    public void modificarRegistroFuncionario(int codigo, Funcionario funcionario, Empresa empresa){
        try{
            if(codigo<=0)mensaje("Ingresar codigo");
            else{
                int codigo1 = empresa.buscaCodigoFuncionario(codigo);
                empresa.modificarRegistroFuncionario(codigo1, funcionario);
                grabar_Funcionario_txt(funcionario,empresa);

            }
        }catch(Exception ex){
            
        }
    }
    
    
    
    
    
    /**Este elimina los itinerario de la empresa a traves del codigo de la clase Bus que esta asociado al itinerario 
     * (sin necesidad de ningun otro atributo del objeto Itinerario), por cual recibe el codigo como int y una clase Empresa llamada empresa usando el metodo eliminar registro de la misma
     * 
     * @param codigo1 Codigo del bus asociado al itinerario, tipo int
     * @param empresa Tipo Empresa
     **/
    public void eliminarRegistroItinerario(int codigo1, Empresa empresa){
        try{
            if(codigo1 == -1) mensaje("Ingese Codigo");
            
            else{
                int codigo = empresa.buscaCodigoItinerario(codigo1);
                if(codigo == -1) {
                mensaje("codigo no existe"); 
                mensaje("Ingrese nuevamente");
                }else{
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar itinerario","Si/No",0);
                    if(s == 0){
                        empresa.eliminarRegistroItinerario(codigo);
                        Itinerario itinerario = new Itinerario(0, "", "", "", "", "","");
                        grabar_Itinerario_txt(itinerario,empresa);
                    }
                }
                
                
            }
        }catch(HeadlessException ex){
            mensaje(ex.getMessage());
        }
    }

    
    
    
    /**
     *Este elimina los funcionarios de la empresa a traves del codigo identificador que tiene cada funcionario 
     *(sin necesidad de ningun otro atributo del objeto Funcionario), por cual recibe el codigo como int y una clase Empresa 
     * llamada empresa usando el metodo eliminar registro de la misma     
     * @param codigo1 Codigo identificador del funcionario de tipo int
     * @param empresa tipo Empresa
     */
    public void eliminarRegistroFuncionario(int codigo1, Empresa empresa){
        try{
            if(codigo1 == -1) mensaje("Ingese Codigo");
            
            else{
                int codigo = empresa.buscaCodigoFuncionario(codigo1);
                if(codigo == -1) {
                mensaje("codigo no existe"); 
                mensaje("Ingrese nuevamente");
                }else{
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar funcionario","Si/No",0);
                    if(s == 0){
                        empresa.eliminarRegistroFuncionario(codigo);
                        Funcionario funcionario = new Funcionario(0, "", "", "", "",-1);
                        grabar_Funcionario_txt(funcionario,empresa);
                    }
                }
                
                
            }
        }catch(HeadlessException ex){
            mensaje(ex.getMessage());
        }
    }
          
    
       
}
