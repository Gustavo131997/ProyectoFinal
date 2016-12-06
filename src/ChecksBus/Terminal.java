package ChecksBus;

/**
 *Esta es la clase terminal que esta compusto por un objeto empresa los datos de un terminal
 * @author ChecksBus.org
 */
public class Terminal {

	private String nombreterminal;
	private String regionterminal;
	private String direccion;
        public Empresa empresa;

    /**
     *
     */
    public Terminal() {
            this.empresa = new Empresa();
	}
        
    /**
     *Constructor de la clase terminal con parametros de nombre, region y direccion
     * @param newName Tipo String
     * @param newRegion Tipo String
     * @param direccion Tipo String
     */
    public Terminal(String newName, String newRegion, String direccion){
            this.nombreterminal=newName;
            this.regionterminal=newRegion;
            this.direccion=direccion;
            this.empresa = new Empresa();
        }
        
    /**
     *
     * @return
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     *
     * @param empresa
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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
        
        /**
         * Permite buscar a todos los usarios administradores de cada empresa perteneciente al terminal
         * @param user Nombre de usuario del Funcionario administrador que se desea buscar
         * @param pass Contraseña del usuario
         * @param rol rol del funcionario
         * @return retorna verdadero la posicion de este si existe, y -1 si este no existe
         **/
        public int validarUsuarios(String user, String pass, int rol){
            Funcionario funcionario = new Funcionario();
            for (int i = 0; i < empresa.cantidadRegistroFuncionario(); i++) {
                funcionario = empresa.obtenerRegistroFuncionario(i);
                if (funcionario.getNombreusuario().equals(user) &&
                   funcionario.getContrasena().equals(pass) &&
                   funcionario.getRol() == rol) { 
                    return i ;
                }
            }
            return -1;

        }
	

}