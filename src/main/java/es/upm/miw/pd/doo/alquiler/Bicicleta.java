package es.upm.miw.pd.doo.alquiler;

public class Bicicleta extends Vehiculo {

	public Bicicleta(String matricul, String descripcion) {
		this.tipoVehiculo = "Bicicleta";
		this.descripcion = descripcion;
		this.matricula = matricula;
	}

	@Override
	public int obtenerPrecioAlquiler(int dias) {
		int resultado = 0;
		for(int i = 1; i <= dias; i++){
			if(i < 3){
				resultado += 3;
			} 
			else {
				resultado += 2;
			}
		}
		return resultado;
	}

}
