package ar.edu.unlam.pb2verano.cochera;

public class Cochera implements Comparable<Cochera> {
	private String identificacion;
	private Boolean reservada;
	Auto auto = new Auto();

	public Cochera(String identificacion, Boolean reservada) {
		this.identificacion = identificacion;
		this.reservada = reservada;
	}

	public Cochera() {
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Boolean getReservada() {
		return reservada;
	}

	public void setReservada(Boolean reservada) {
		this.reservada = reservada;
	}

	public Auto getOcupadaPor() {
		return this.auto;
	}

	public void setOcupadaPor(Auto auto) {
		this.auto = auto;
	}

	@Override
	public int compareTo(Cochera arg0) {
		int r;
		r = getIdentificacion().compareTo(arg0.getIdentificacion());
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + ((reservada == null) ? 0 : reservada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cochera other = (Cochera) obj;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (reservada == null) {
			if (other.reservada != null)
				return false;
		} else if (!reservada.equals(other.reservada))
			return false;
		return true;
	}

}
