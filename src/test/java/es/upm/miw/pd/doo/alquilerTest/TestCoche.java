package es.upm.miw.pd.doo.alquilerTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import es.upm.miw.pd.doo.alquiler.Categoria;
import es.upm.miw.pd.doo.alquiler.Coche;

public class TestCoche {

	private Coche c1;
	private Coche c2;
	private Coche c3;
	
	@Before
	public void init(){
		this.c1 = new Coche("Seat Ibiza", Categoria.A);
		this.c2 = new Coche("Mazda V6", Categoria.B);
		this.c3 = new Coche("Lamborghini Diablo", Categoria.C);
	}
	
	
	@Test
	public void testDescripcionCoche(){
		assertEquals("(Coche:Seat Ibiza)", c1.toString());
		assertEquals("(Coche:Mazda V6)", c2.toString());
		assertEquals("(Coche:Lamborghini Diablo)", c3.toString());
	}
	
	@Test
	public void testAlquilerCoche1dia(){
		assertEquals(10, c1.obtenerPrecioAlquiler(1));
		assertEquals(15, c2.obtenerPrecioAlquiler(1));
		assertEquals(20, c3.obtenerPrecioAlquiler(1));
	}
	
	@Test
	public void testAlquilerCoche5dias(){
		assertEquals(46, c1.obtenerPrecioAlquiler(5));
		assertEquals(69, c2.obtenerPrecioAlquiler(5));
		assertEquals(92, c3.obtenerPrecioAlquiler(5));
	}
	
	
	@Test
	public void testAlquilerCoche14dias(){
		assertEquals(97, c1.obtenerPrecioAlquiler(14));
		assertEquals(163, c2.obtenerPrecioAlquiler(14));
		assertEquals(194, c3.obtenerPrecioAlquiler(14));
	}
}
