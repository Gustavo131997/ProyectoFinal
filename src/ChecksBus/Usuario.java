package ChecksBus;

/**
 *Clase abstracta de un usuario
 * @author ChecksBus.org
 */
abstract class Usuario {

    /**
     *
     */
    protected int identificadorAleatorio;

    /**
     *
     * @return
     */
    public int getIdentificadorAleatorio() {
		return this.identificadorAleatorio;
	}

    /**
     * 
     * @param identificadorAleatorio es de tipo String
     */
    public void setIdentificadorAleatorio(int identificadorAleatorio) {
            this.identificadorAleatorio = identificadorAleatorio;
    }

    
    /**
     *
     */
    public Usuario() {
		
		
    }
    

    public Usuario(int identificadorAleatorio) {
        this.identificadorAleatorio = identificadorAleatorio;
    }

}