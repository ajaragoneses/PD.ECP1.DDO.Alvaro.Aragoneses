package es.upm.miw.pd.doo.alquiler;

public abstract class Vehiculo {
	
	protected int id;
	protected String descripcion;
	
	public abstract int obtenerPrecioAlquiler(int dias);
	
	@Override
	public String toString(){
		return "("+id+":"+descripcion+")";
	}
	
}
