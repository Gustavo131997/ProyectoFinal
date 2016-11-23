package testchecksbus;

public class Itinerario {

	private String origen;
	private String destino;
	private String horaLlegada;
	private String horaSalida;
	private String fecha;
	private String estado;

	public Itinerario() {
		// TODO - implement Itinerario.Itinerario
		throw new UnsupportedOperationException();
	}

	public String getOrigen() {
		return this.origen;
	}

	/**
	 * 
	 * @param origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return this.destino;
	}

	/**
	 * 
	 * @param destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getHoraLlegada() {
		return this.horaLlegada;
	}

	/**
	 * 
	 * @param horaLlegada
	 */
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

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

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

}