package testchecksbus;

public class Funcionario extends Usuario {

	private String nombre;
	private String apellido;
	private String empresa;
	private String nombreusuario;
	private String contrasena;

	public Funcionario() {

	}
        
        public Funcionario(String nombre, String apellido, String empresa, String nombreusuario, String contraseña){
            this.nombre=nombre;
            this.apellido=apellido;
            this.empresa=empresa;
            this.nombreusuario=nombreusuario;
            this.contrasena=contraseña;
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

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	/**
	 * 
	 * @param empresa
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNombreusuario() {
		return this.nombreusuario;
	}

	/**
	 * 
	 * @param nombreusuario
	 */
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	/**
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}