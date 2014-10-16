package es.upm.miw.pd.doo.alquiler;

public abstract class Vehiculo {
	
	protected String tipoVehiculo;
	protected String descripcion;
	
	public abstract int obtenerPrecioAlquiler(int dias);
	
	@Override
	public String toString(){
		return "("+tipoVehiculo+":"+descripcion+")";
	}
	
}
