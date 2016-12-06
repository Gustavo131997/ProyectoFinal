package ChecksBus;

import datos.Archivo;

/**
 *Esta es la clase Itinerario, la cual contien los dato de un itinerario, como son origen, destino, hora de salida y llegada
 * @author ChecksBus.org
 */
public class Itinerario {

	private String origen;
	private String destino;
	private String horaLlegada;
	private String horaSalida;
	private String fecha;

    /**
     *
     */
    public Bus bus = new Bus();

    /**
     *
     */
    public Archivo archivo = new Archivo("itinerario.txt");

    /**
     *Constructor de la clase Itinerario
     * @param codigo Tipo int
     * @param origen Tipo String
     * @param destino Tipo String
     * @param horaLlegada Tipo String
     * @param horaSalida Tipo String
     * @param fecha Tipo String
     * @param estado Tipo String
     */
    public Itinerario(int codigo, String origen, String destino, String horaLlegada, String horaSalida, String fecha, String estado) {
        this.origen = origen;
        this.destino = destino;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        bus.setCodigo(codigo);
        bus.setEstado(estado);
    }

    /**
     *Constructor sin parametro
     */
    public Itinerario() {
		
	}

    /**
     *
     * @return
     */
    public String getOrigen() {
		return this.origen;
	}

	/**
	 * 
	 * @param origen es de tipo String
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

    /**
     *
     * @return
     */
    public String getDestino() {
		return this.destino;
	}

	/**
	 * 
	 * @param destino es de tipo String
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

    /**
     *
     * @return
     */
    public String getHoraLlegada() {
		return this.horaLlegada;
	}

	/**
	 * 
	 * @param horaLlegada es de tipo String
	 */
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

    /**
     *
     * @return
     */
    public String getHoraSalida() {
		return this.horaSalida;
	}

	/**
	 * 
	 * @param horaSalida
	 */
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

    /**
     *
     * @return
     */
    public String getFecha() {
		return this.fecha;
    }

    /**
     * 
     * @param fecha
     */
    public void setFecha(String fecha) {
            this.fecha = fecha;
    }
    

    /**
     *
     * @return
     */
    public Bus getBus() {
            return bus;
        }

    /**
     *
     * @param bus
     */
    public void setBus(Bus bus) {
            this.bus = bus;
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
 * Metodo toString de la clase Itinerario que retorna todos los atributos de la clase
 * @return Tipo String
 */
    @Override
    public String toString() {
        return bus.getCodigo()+", "+this.origen+", "+this.destino
       +", "+this.horaLlegada+", "+this.horaSalida+", "+this.fecha+", "+bus.getEstado();
    }
        
        
} 