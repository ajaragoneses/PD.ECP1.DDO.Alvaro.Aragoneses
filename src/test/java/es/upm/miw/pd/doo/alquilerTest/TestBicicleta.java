package es.upm.miw.pd.doo.alquilerTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.doo.alquiler.Bicicleta;

public class TestBicicleta {

	private Bicicleta b;
	
	@Before
	public void init(){
		this.b = new Bicicleta("B0001","BMX KHE Evo 0.3");
	}
	
	
	@Test
	public void testDescripcionBicicleta(){
		assertEquals("(Bicicleta:BMX KHE Evo 0.3)", b.toString());
	}
	
	@Test
	public void testAlquilerBicicleta1dia(){
		assertEquals(3, b.obtenerPrecioAlquiler(1));
	}
	
	@Test
	public void testAlquilerBicicleta5dias(){
		assertEquals(12, b.obtenerPrecioAlquiler(5));
	}
	
	
	@Test
	public void testAlquilerBicicleta14dias(){
		assertEquals(30, b.obtenerPrecioAlquiler(14));
	}

}
