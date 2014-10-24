package es.upm.miw.pd.doo.alquiler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GestorAlquilerVehiculos {

	private Map<String,Vehiculo> listaVehiculos;
	private int idVehiculo;
	
	public int numeroVehiculos(){
		return this.listaVehiculos.size();
	}
	
	public GestorAlquilerVehiculos(){
		this.listaVehiculos = new LinkedHashMap<String,Vehiculo>();
		this.idVehiculo = 0;
	}
	
	public void altaVehiculo(Vehiculo v){
		this.listaVehiculos.put(v.getMatricula(), v);
	}
	
	public String verListaVehiculos(){
		String ret = "[";
		Iterator<Entry<String, Vehiculo>> entries = this.listaVehiculos.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  String matricula = (String) thisEntry.getKey();
		  Vehiculo v = (Vehiculo) thisEntry.getValue();
		  ret += v.toString();
		  if (entries.hasNext()){
			  ret += ",";
		  }
		}
		ret += "]";
		return ret;
	}
	
	public int calcularPrecio(String matricula, int dias){
		Vehiculo v = this.listaVehiculos.get(matricula);
		if (v == null){
			return 0;
		}
		return v.obtenerPrecioAlquiler(dias);
	}
	
}
