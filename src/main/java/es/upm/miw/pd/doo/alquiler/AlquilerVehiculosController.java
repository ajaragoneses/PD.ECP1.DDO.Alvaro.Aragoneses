package es.upm.miw.pd.doo.alquiler;

import upm.jbb.IO;

public class AlquilerVehiculosController {
	private GestorAlquilerVehiculos gav;
	
	public AlquilerVehiculosController(){
		this.gav = new GestorAlquilerVehiculos();
	}
	
	public void numeroVehiculos(){
		IO.out.println("Número de Vehiculos disponibles: " + this.gav.numeroVehiculos());
	}
	
	public void altaVehiculo(){
		Object[] objs = {"Coche", "Moto", "Bicicleta"};
		Object[] categorias = {Categoria.A, Categoria.B, Categoria.C};
		
		String vehiculo_sel = (String) IO.in.select(objs, "Elije tipo de vehiculo");
		String matricula = IO.in.readString("Introduce la matricula");
		String descripcion = IO.in.readString("Introduce la descripción");
		
		switch (vehiculo_sel) {
		case "Coche":
			Categoria cat = (Categoria) IO.in.select(categorias, "Selecciona la categoria");
			this.gav.altaVehiculo(new Coche(matricula, descripcion, cat));
			break;
		case "Moto":
			this.gav.altaVehiculo(new Moto(matricula, descripcion));
			break;
		case "Bicicleta":
			this.gav.altaVehiculo(new Bicicleta(matricula, descripcion));
			break;
		default:
			break;
		}
	}
	
	public void verListaVehiculos(){
		IO.out.println("Lista de Vehiculos disponibles: " + this.gav.verListaVehiculos());
	}
	
	public void calcularPrecio(){
		String matricula = IO.in.readString("Introduce la matricula");
		int dias = IO.in.readInt("Introduce el numero de dias");
		int precio = this.gav.calcularPrecio(matricula, dias);
		if(precio == 0){
			IO.out.println("No existe ningún Vehiculo con esa matrícla");
		} else {
			IO.out.println("El precio por alquilar el vehiculo con matricula: " 
					+ matricula + " durante " + dias + " dias es de: " + precio +"€");
		}
	}

}
