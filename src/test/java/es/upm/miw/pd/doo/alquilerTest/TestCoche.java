package es.upm.miw.pd.doo.alquilerTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import es.upm.miw.pd.doo.alquiler.Categoria;
import es.upm.miw.pd.doo.alquiler.Coche;

public class TestCoche {

	private Coche c;
	
	@Before
	public void init(){
		this.c = new Coche("Seat Ibiza", Categoria.C);
	}
	
	
	@Test
	public void testDescripcionCoche(){
		assertEquals("(Coche:Seat Ibiza)", c.toString());
	}
	
	@Test
	public void testAlquilerCoche1dia(){
		assertEquals(20, c.obtenerPrecioAlquiler(1));
	}
	
	@Test
	public void testAlquilerCoche5dias(){
		assertEquals(92, c.obtenerPrecioAlquiler(5));
	}
	
	
	@Test
	public void testAlquilerCoche14dias(){
		assertEquals(194, c.obtenerPrecioAlquiler(14));
	}
}
