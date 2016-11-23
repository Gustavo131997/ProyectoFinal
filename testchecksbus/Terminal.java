package testchecksbus;

import java.util.ArrayList;

public class Terminal {

	private String nombreterminal;
	private String regionterminal;
	private String direccion;
    private ArrayList <Itinerario> itinerarios;
    private ArrayList <Empresa> empresas;

	public Terminal() {
		// TODO - implement Terminal.Terminal
		//throw new UnsupportedOperationException();
	}
        
        public Terminal(String newName, String newRegion, String direccion){
            this.nombreterminal=newName;
            this.regionterminal=newRegion;
            this.direccion=direccion;
            this.itinerarios= new ArrayList <>();
            this.empresas= new ArrayList <> ();            
            
            addEmpresas();
        }
        
        private void addEmpresas(){
            Funcionario admin = new Funcionario("Pedro","apellido1","Empresa1","usu1","PASS1");
            Empresa empresa = new Empresa("Empresa1","1-6",admin);
            this.empresas.add(empresa);                        
            
            admin = new Funcionario("Juan","Apellido2","Empresa2","usu2","PASS2");
            empresa= new Empresa("Empresa2","3-7",admin);
            this.empresas.add(empresa);
            
            admin = new Funcionario("Diego","Apellido","Empresa3","usu3","PASS3");
            empresa = new Empresa("Empresa3", "5-9",admin);
            this.empresas.add(empresa);
        }

	public String getNombreterminal() {
		return this.nombreterminal;
	}

	/**
	 * 
	 * @param nombreterminal
	 */
	public void setNombreterminal(String nombreterminal) {
		this.nombreterminal = nombreterminal;
	}

	public String getRegionterminal() {
		return this.regionterminal;
	}

	/**
	 * 
	 * @param regionterminal
	 */
	public void setRegionterminal(String regionterminal) {
		this.regionterminal = regionterminal;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private void agregarItinerario() {
		// TODO - implement Terminal.agregarItinerario
		throw new UnsupportedOperationException();
	}

	private void editarItinerario() {
		// TODO - implement Terminal.editarItinerario
		throw new UnsupportedOperationException();
	}

	private void eliminarItinerario() {
		// TODO - implement Terminal.eliminarItinerario
		throw new UnsupportedOperationException();
	}

	public void mostrarItinerario() {
		// TODO - implement Terminal.mostrarItinerario
		//throw new UnsupportedOperationException();
                    
	}

}