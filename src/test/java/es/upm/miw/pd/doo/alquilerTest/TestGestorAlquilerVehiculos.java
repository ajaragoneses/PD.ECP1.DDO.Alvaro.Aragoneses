package es.upm.miw.pd.doo.alquilerTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.doo.alquiler.Bicicleta;
import es.upm.miw.pd.doo.alquiler.Categoria;
import es.upm.miw.pd.doo.alquiler.Coche;
import es.upm.miw.pd.doo.alquiler.GestorAlquilerVehiculos;
import es.upm.miw.pd.doo.alquiler.Moto;

public class TestGestorAlquilerVehiculos {

	private GestorAlquilerVehiculos gav;
	private int vehiculo_1;
	private int vehiculo_2;
	private int vehiculo_3;
	
	@Before
	public void init(){
		this.gav = new GestorAlquilerVehiculos();
		this.gav.altaVehiculo(new Coche("C0001","Citroen Laguna", Categoria.B));
		this.gav.altaVehiculo(new Moto("M0001","Vespino"));
		this.gav.altaVehiculo(new Bicicleta("B0001","Bici de Paseo"));
	}
	
	@Test
	public void testAltaVehiculos() {
		assertEquals(0, this.vehiculo_1);
		assertEquals(1, this.vehiculo_2);
		assertEquals(2, this.vehiculo_3);
	}
	
	
	@Test
	public void testVerListaVehiculos() {
		assertEquals("[(Coche:Citroen Laguna),(Moto:Vespino),(Bicicleta:Bici de Paseo)]",this.gav.verListaVehiculos());
	}

	@Test
	public void testCalcularPrecio() {
		fail("Not yet implemented");
	}



}
