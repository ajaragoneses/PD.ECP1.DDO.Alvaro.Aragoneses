package es.upm.miw.pd.doo.alquilerTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.doo.alquiler.Moto;

public class TestMoto {

	private Moto m;
	
	@Before
	public void init(){
		this.m = new Moto("M0001","Triumph Bonneville");
	}
	
	
	@Test
	public void testDescripcionMoto(){
		assertEquals("(Moto:Triumph Bonneville)", m.toString());
	}
	
	@Test
	public void testAlquilerMoto1dia(){
		assertEquals(8, m.obtenerPrecioAlquiler(1));
	}
	
	@Test
	public void testAlquilerMoto5dias(){
		assertEquals(40, m.obtenerPrecioAlquiler(5));
	}
	
	
	@Test
	public void testAlquilerMoto14dias(){
		assertEquals(105, m.obtenerPrecioAlquiler(14));
	}

}
