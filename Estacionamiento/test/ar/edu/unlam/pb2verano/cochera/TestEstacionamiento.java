package ar.edu.unlam.pb2verano.cochera;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEstacionamiento {

	@Test
	public void testEstacionamiento() {
		Estacionamiento estacionamiento = new Estacionamiento("nombre");

		Auto a1 = new Auto("123asd", true);
		Auto a2 = new Auto("172jas", false);
		Auto a3 = new Auto("273ori", false);
		Auto a4 = new Auto("826ger", true);

		Cochera c1 = new Cochera("1", true);
		Cochera c2 = new Cochera("2", false);
		Cochera c3 = new Cochera("3", true);
		Cochera c4 = new Cochera("4", true);

		estacionamiento.agregarCochera(c1);
		estacionamiento.agregarCochera(c2);
		estacionamiento.agregarCochera(c3);
		estacionamiento.agregarCochera(c4);

		try {
			a1.estacionar(c3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		assertEquals(a1, c3.getOcupadaPor());
		System.out.println(c3.getOcupadaPor());
		assertEquals(c3, a1.buscar());
		a1.salir();
		assertEquals(null, a1.buscar());

	}

}
