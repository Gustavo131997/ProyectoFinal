package ChecksBus;

import datos.Archivo;

/**
 *Clase para modelar a un funcionario, sirve para modelar a un trabajador de una empresa, el cual es herencia de la clase usuario
 * @author ChecksBus.org
 */
public class Funcionario extends Usuario {

	private String nombre;
	private String apellido;
	private String nombreusuario;
	private String contrasena;
        Empresa empresa;
        private int rol;

    /**
     *
     */
    public Archivo archivo = new Archivo("funcionario.txt");

    /**
     *
     */
    public Funcionario() {
        super(1);
        this.nombre = "Gustavo";
        this.apellido = "Huerta";
        this.nombreusuario = "gus_admin";
        this.contrasena = "13deenero";
        this.rol = 0;
	}
        
    /**
     *Constructor de la clase Funcionario con parametros
     * @param id Tipo entero
     * @param nombre Tipo String
     * @param apellido Tipo String
     * @param usuario Tipo String
     * @param contraseña Tipo String
     * @param rol Tipo int
     */
    public Funcionario(int id, String nombre, String apellido, String usuario, String contraseña, int rol) {
            this.identificadorAleatorio = id;
           this.nombre=nombre;
            this.apellido=apellido;
            this.nombreusuario=usuario;
            this.contrasena=contraseña;
            this.rol = rol;
            super.identificadorAleatorio = id;
            
        }

    /**
     *
     * @return un String llamada nombre
     */
    public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre es de tipo String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     *
     * @return un String llamado apellido
     */
    public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido es de tipo String
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
 
    /**
     *
     * @return
     */
    public Empresa getEmpresa() {
		return this.empresa;
	}

	/**
	 * 
	 * @param empresa es de tipo Objeto empresa
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

    /**
     *
     * @return
     */
    public String getNombreusuario() {
		return this.nombreusuario;
	}

	/**
	 * 
	 * @param nombreusuario es de tipo String
	 */
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

    /**
     *
     * @return
     */
    public String getContrasena() {
		return this.contrasena;
	}

	/**
	 * 
	 * @param contrasena es de tipo String
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

    /**
     *
     * @return
     */
    public int getRol() {
            return rol;
        }

    /**
     *
     * @param rol
     */
    public void setRol(int rol) {
            this.rol = rol;
        }

    /**
     *
     * @return
     */
    public Archivo getArchivo() {
        return archivo;
    }

    /**
     *
     * @param archivo
     */
    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    /**
     *
     * @return
     */
    @Override
    public int getIdentificadorAleatorio() {
        return identificadorAleatorio;
    }

        @Override
    public void setIdentificadorAleatorio(int identificadorAleatorio) {
        this.identificadorAleatorio = identificadorAleatorio;
    }

    /**
     *Metodo toString de clase Funcionario que retorna todos los atributos de un Funcionario
     * @return Tipo String
     */
    @Override
    public String toString() {
        return this.identificadorAleatorio+", "
                +this.nombre+", "+this.apellido+", "+this.nombreusuario
                +", "+this.contrasena+", "+this.rol;
    }
        
        
}