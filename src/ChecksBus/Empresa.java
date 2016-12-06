/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChecksBus;

import java.util.ArrayList;

/**
 *Clase Empresa que contiene los principales datos para modelar una empresa de buses, como pueden ser la catidad de funcionarios, y buses o itinerarios
 * @author ChecksBus.org
 */
public class Empresa {
    private String nombreEmpresa;
    public ArrayList<Itinerario> itinerarios = new ArrayList<>();
    public Itinerario itinerario = new Itinerario();
    private ArrayList <Funcionario> trabajadores = new ArrayList<>();

    /**
     *
     */
    public Funcionario admin = new Funcionario();
    
    /**
     *
     */
    public Empresa(){}
    
    /**
     *
     * @param a
     */
    public Empresa(ArrayList<Itinerario> a){
        this.itinerarios = a;
    }

    /**
     *
     * @return de un String 
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     *
     * @param nombreEmpresa de tipo String
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    /**
     *Agrega un nuevo registro al ArrayList de itinerarios
     * @param p El nuevo objeto de Itinerario para agregar al ArrayList
     */
    public void agregarRegistroItinerario(Itinerario p){
        this.itinerarios.add(p);
    }

    
    
    /**
     *Agrega un nuevo registro al ArrayList de Funcionarios
     * @param funcionario El nuevo objeto Funcionario para agregar al ArrayList
     */
    public void agregarRegistroFuncionario(Funcionario funcionario){
        this.trabajadores.add(funcionario);
    }

    
    
    /**
     *Cambia el objeto Itinerario en la posicion que esta el objeto que queremos modificar por un nuevo objeto entregado como parametro
     * @param i Posicion del objeto que se quiere cambiar
     * @param p Nuevo objeto para cambiar por el anterior
     */
    public void modificarRegistroItinerario(int i, Itinerario p){
        this.itinerarios.set(i, p);
    }

    
    
    
    /**
     *Cambia el objeto Itinerario en la posicion que esta el objeto que queremos modificar por un nuevo objeto entregado como parametro
     * @param i Posicion del objeto que se quiere cambiar
     * @param p Nuevo objeto Funcionario para cambiar por el anterior
     */
    public void modificarRegistroFuncionario(int i, Funcionario p){
        this.trabajadores.set(i, p);
    }
    
    /**
     *Elimina el objeto Itinerario ubicado en la posicion que queremos
     * @param i Posición del Itinerario que queremos eliminar
     */
    public void eliminarRegistroItinerario(int i){
        this.itinerarios.remove(i);
    }

    /**
     *Elimina el objeto Funcioanrio ubicado en la posicion que queremos
     * @param i Posición del Funcionario que queremos eliminar
     */
    public void eliminarRegistroFuncionario(int i){
        this.trabajadores.remove(i);
    }

    
    
    /**
     *Obtiene el objeto Itinerario ubicado en la posicion que queremos
     * @param i Posicion del Itinerario que necesitamos obtener
     * @return Un objeto Itinerario
     */
    public Itinerario obtenerRegistroItinerario(int i){
        return itinerarios.get(i);
    }
    
    
    
    /** 
     *Retorna un Funcionario de ArrayList trabajadores
     * @param i indice
     * @return Type Funcionario
     **/
    public Funcionario obtenerRegistroFuncionario(int i){
        return trabajadores.get(i);
    }
    
    
    
    /** 
     *Retorna el cantidad de registro que hay en el ArrayList de Itinerario
     * @return Type int
     **/
    public int cantidadRegistroItinerario(){
        return this.itinerarios.size();
    }
    
    
    
    /**
     * Retorna el cantidad de registro que hay en el ArrayList de Funcionario
     * @return Type int ArrayList trabajadores
     */
    public int cantidadRegistroFuncionario(){
        return this.trabajadores.size();
    }
    
    
    
    /**
     * Busca el codigo de un objeto de tipo Itnerario 
     * @param codigo atributo que le pertenece a bus
     * @return Type int
     **/ 
    public int buscaCodigoItinerario(int codigo){
        for(int i = 0; i < cantidadRegistroItinerario(); i++){
            if(codigo == obtenerRegistroItinerario(i).bus.getCodigo())return i;
        }
        return -1;
    }
   
    
    
    
    /**
     *Busca el codigo de un objeto de tipo Funcionario
     * @param codigo de tipo entero
     * @return un entero que la posicion de un objeto de dentro de arraylist y un -1 si no esta
     */
    public int buscaCodigoFuncionario(int codigo){
        for(int i = 0; i < cantidadRegistroFuncionario(); i++){
            if(codigo == obtenerRegistroFuncionario(i).getIdentificadorAleatorio())return i;
        }
        return -1;
    }

    
    
    /**
     *
     * @return
     */
    public Itinerario getItinerario() {
        return itinerario;
    }

    /**
     *
     * @param itinerario
     */
    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    /**
     *
     * @return
     */
    public Funcionario getAdmin() {
        return admin;
    }

    /**
     *
     * @return
     */
    public ArrayList<Funcionario> getTrabajadores() {
        return trabajadores;
    }

    /**
     *
     * @param trabajadores
     */
    public void setTrabajadores(ArrayList<Funcionario> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    /**
     *
     * @param admin
     */
    public void setAdmin(Funcionario admin) {
        this.admin = admin;
    }
}
