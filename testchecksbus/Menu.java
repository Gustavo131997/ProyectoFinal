/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testchecksbus;
import java.util.Scanner;

/**
 *
 * @author Batman
 */
public class Menu {
    private String opc;
    private Scanner leer; 
    private Terminal terminal;
    public Menu(){
        this.leer= new Scanner(System.in);
        terminal = new Terminal("Rodobiario", "Novena Region", "Reyes Católicos 1420");
    }
    
    public void terminal(){                
        System.out.println("1: Usuario \n2: Fucionario \n3: Salir");
        opc = leer.next();
        switch(opc){
            case "1" : 
                do {
                    menuUsuario();
                } while (!opc.equals("2"));
                
                break;
                
            case "2":
                menuFuncionarios();
                break;
                
            case "3":
                System.exit(0);
                break;
                
            default :
                break;
        }
    }
    
    public void menuUsuario(){         
        System.out.println("Bienvenido al terminal Rodobiario ");
        System.out.println("1: Mostrar itinerario \n2: Volver \n3: Salir");
        opc=leer.next();
        switch(opc){
            case "1":
                terminal.mostrarItinerario();
                break;
            case "2": 
                break;
            case "3":
                System.exit(0);
                break;
                
        }
    }
    
    public void menuFuncionarios(){
        System.out.println("Ingrese Empresa");
        System.out.println("1: Empresa1 \n2: Empresa2 \n3: Empresa3");
        this.opc=leer.next();
        switch(opc){
            case "1":
                terminal.mostrarItinerario();
                break;
            case "2": 
                System.exit(0);
        }
    }
}
