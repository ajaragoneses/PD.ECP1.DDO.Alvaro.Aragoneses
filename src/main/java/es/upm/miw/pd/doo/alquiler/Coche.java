package es.upm.miw.pd.doo.alquiler;

public class Coche extends Vehiculo {

	private Categoria categoria;
	
	public Coche(String descipcion, Categoria categoria){
		this.tipoVehiculo = "Coche";
		this.descripcion = descipcion;
		this.categoria = categoria;
	}
	
	@Override
	public int obtenerPrecioAlquiler(int dias) {
		// TODO Auto-generated method stub
		return 0;
	}

}
