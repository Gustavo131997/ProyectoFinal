/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testchecksbus;

/**
 *
 * @author Gustavo Huerta
 */
public class Bus {
    private String codigo;
    private String nombreChofer;
    private String OrigenBus;
    private String DestinoBus;
    
    public Bus(){
        
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreChofer() {
        return nombreChofer;
    }

    public void setNombreChofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }

    public String getOrigenBus() {
        return OrigenBus;
    }

    public void setOrigenBus(String OrigenBus) {
        this.OrigenBus = OrigenBus;
    }

    public String getDestinoBus() {
        return DestinoBus;
    }
    
    public void setDestinoBus(String DestinoBus) {
        this.DestinoBus = DestinoBus;
    }
    
    
}
