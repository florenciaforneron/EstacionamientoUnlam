package ar.edu.unlam.pb2verano.cochera;

public class Auto {

	private String patente;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((habilitado == null) ? 0 : habilitado.hashCode());
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
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
		Auto other = (Auto) obj;
		if (habilitado == null) {
			if (other.habilitado != null)
				return false;
		} else if (!habilitado.equals(other.habilitado))
			return false;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}

	private Boolean habilitado;
	Cochera cochera;

	public Auto() {

	}

	public Auto(String patente, Boolean habilitado) {
		super();
		this.setPatente(patente);
		this.setHabilitado(habilitado);
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public Cochera getCochera() {
		return cochera;
	}

	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}

	public void estacionar(Cochera cochera) throws Exception {
		if (cochera.getOcupadaPor().equals(cochera.auto) && cochera.getReservada().equals(false)) {
			this.cochera = cochera;
			cochera.setOcupadaPor(this);
		} else {
			if (cochera.getOcupadaPor().equals(cochera.auto) && cochera.getReservada().equals(true)
					&& this.habilitado.equals(true)) {
				this.cochera = cochera;
				cochera.setOcupadaPor(this);
			} else
				throw new Exception("Cochera no habilitada");
		}
	}

	public Cochera buscar() {
		return this.cochera;
	}

	public void salir() {
		this.cochera = null;
	}

}
