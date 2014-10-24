package es.upm.miw.pd.doo.alquiler;

import upm.jbb.IO;


public class AlquilerVehiculos {

	public static void main(String[] args) {
		IO.in.addController(new AlquilerVehiculosController());
	}

}
