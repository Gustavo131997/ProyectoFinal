/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChecksBus;

/**
 *Esta la clase Bus que contiene codigo para identificar a un bus, y un estado
 * @author ChecksBus.og
 */
public class Bus {
    private int codigo;
    private String estado;
    
    /**
     *
     */
    public Bus(){
        
    }
    
    /**
     *
     * @return un  entero llamado codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo es de tipo entero 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return ub String llamado estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     *
     * @param estado de tipo String
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
}
