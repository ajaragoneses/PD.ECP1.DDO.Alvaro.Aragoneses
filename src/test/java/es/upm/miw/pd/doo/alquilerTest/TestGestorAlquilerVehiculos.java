package es.upm.miw.pd.doo.alquilerTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.doo.alquiler.Bicicleta;
import es.upm.miw.pd.doo.alquiler.Categoria;
import es.upm.miw.pd.doo.alquiler.Coche;
import es.upm.miw.pd.doo.alquiler.GestorAlquilerVehiculos;
import es.upm.miw.pd.doo.alquiler.Moto;
import es.upm.miw.pd.doo.alquiler.Vehiculo;

public class TestGestorAlquilerVehiculos {

	private GestorAlquilerVehiculos gav;
	private Vehiculo vehiculo_1;
	private Vehiculo vehiculo_2;
	private Vehiculo vehiculo_3;
	
	@Before
	public void init(){
		this.gav = new GestorAlquilerVehiculos();
		this.vehiculo_1 = new Coche("C0001","Citroen Laguna", Categoria.B);
		this.vehiculo_2 = new Moto("M0001","Vespino");
		this.vehiculo_3 = new Bicicleta("B0001","Bici de Paseo");
		
		this.gav.altaVehiculo(this.vehiculo_1);
		this.gav.altaVehiculo(this.vehiculo_2);
		this.gav.altaVehiculo(this.vehiculo_3);
	}
	
	@Test
	public void testAltaVehiculos() {
		assertEquals(3, this.gav.numeroVehiculos());
	}
	
	
	@Test
	public void testVerListaVehiculos() {
		assertEquals("[(Coche:Citroen Laguna),(Moto:Vespino),(Bicicleta:Bici de Paseo)]",this.gav.verListaVehiculos());
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(93, this.gav.calcularPrecio("C0001", 7));
		assertEquals(32, this.gav.calcularPrecio("M0001", 4));
		assertEquals(32, this.gav.calcularPrecio("B0001", 15));
	}



}
