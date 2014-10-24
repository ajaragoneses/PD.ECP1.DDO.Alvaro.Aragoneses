package es.upm.miw.pd.doo.alquiler;

public class Coche extends Vehiculo {

	private Categoria categoria;
	
	public Coche(String matricula, String descripcion, Categoria categoria){
		this.tipoVehiculo = "Coche";
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.matricula = matricula;
	}
	
	@Override
	public int obtenerPrecioAlquiler(int dias) {
		int precio_base = 0;
		int resultado = 0;
		double porcentaje_precio = 0.0;
		switch (this.categoria){
			case A:
				precio_base = 10;
			break;
			case B:
				precio_base = 15;
			break;
			case C:
				precio_base = 20;
			break;
			default:
				System.out.println("Alcanzado punto inaccesible");
		}
		for(int i = 1; i <= dias; i++){
			if(i < 4){
				porcentaje_precio = 1;
			} 
			else if (i < 8) {
				porcentaje_precio = 0.8;
			}
			else {
				porcentaje_precio = 0.5;
			}
			resultado += precio_base * porcentaje_precio;
		}
		return resultado;
	}

}
