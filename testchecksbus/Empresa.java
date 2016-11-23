package testchecksbus;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private String rangoAndenes;
    private Funcionario admin;
    private ArrayList <Funcionario> trabajadores;
        
        public Empresa(String nombre, String rangoAndenes, Funcionario admin){
            this.nombre=nombre;
            this.rangoAndenes=rangoAndenes;
            this.admin= admin;
            this.trabajadores=new ArrayList<> ();
        }

   public Empresa(){
   	
   }
        
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRangoAndenes() {
		return this.rangoAndenes;
	}

	/**
	 * 
	 * @param rango
	 */
	public void setRangoAndenes(String rango) {
		this.rangoAndenes = rango;
	}

	private void agregarFuncionario() {
		// TODO - implement Empresa.agregarFuncionario
		throw new UnsupportedOperationException();
	}

	private void editarFuncionario() {
		// TODO - implement Empresa.editarFuncionario
		throw new UnsupportedOperationException();
	}

	private void eliminarFuncionario() {
		// TODO - implement Empresa.eliminarFuncionario
		throw new UnsupportedOperationException();
	}

	private void mostrarFuncionario() {
		// TODO - implement Empresa.mostrarFuncionario
		throw new UnsupportedOperationException();
	}

}