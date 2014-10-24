package es.upm.miw.pd.doo.alquiler;

public class Moto extends Vehiculo {

	public Moto(String descripcion) {
		this.tipoVehiculo = "Moto";
		this.descripcion = descripcion;	
	}

	@Override
	public int obtenerPrecioAlquiler(int dias) {
		int resultado = 0;
		for(int i = 1; i <= dias; i++){
			if(i < 8){
				resultado += 8;
			} 
			else {
				resultado += 7;
			}
		}
		return resultado;
	}

}
