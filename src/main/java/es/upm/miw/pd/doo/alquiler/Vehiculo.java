package es.upm.miw.pd.doo.alquiler;

public abstract class Vehiculo {
	
	protected String tipoVehiculo;
	protected String descripcion;
	protected String matricula;
	
	public abstract int obtenerPrecioAlquiler(int dias);
	public String getMatricula(){
		return this.matricula;
	}
	
	@Override
	public String toString(){
		return "("+tipoVehiculo+":"+descripcion+")";
	}
	
}
