package ar.edu.unlam.pb2verano.cochera;

import java.util.TreeSet;

public class Estacionamiento {

	private String nombre;
	private TreeSet<Cochera> estacionamiento = new TreeSet<Cochera>();

	public Estacionamiento(String nombre) {
		this.setNombre(nombre);
	}

	public void agregarCochera(Cochera cochera) {
		estacionamiento.add(cochera);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet<Cochera> getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(TreeSet<Cochera> estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public Integer getCantidadCocherasDisponibles() {
		Integer resultado = 0;

		for (Cochera cochera : estacionamiento) {
			if (cochera.getOcupadaPor().equals(null)) {
				resultado++;
			}
		}
		return resultado;
	}

	public Integer getCantidadCocherasOcupadas() {
		Integer resultado = 0;
		for (Cochera cochera : estacionamiento) {
			if (cochera.getOcupadaPor() != null) {
				resultado++;
			}
		}
		return resultado;
	}

	// public Cochera buscarCocheraDisponible() {
	// Cochera cocheraLibre = null;
	//// for (Cochera cochera : estacionamiento) {
	//// while (cochera.getOcupadaPor().equals(null)) {
	//// cocheraLibre = cochera;
	//// break;
	//// }
	//// }
	//
	// for (Cochera cochera : estacionamiento) {
	// cocheraLibre = cochera;
	// if (cochera.auto.equals()) break;
	// }
	// return cocheraLibre;
	//
	// }

}
