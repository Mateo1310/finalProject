package aereolinea;

import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vuelo {
	
	String idVuelo;
	PriorityQueue<Pasajero> colaPasajero =  new PriorityQueue<Pasajero>();
	
	public void addPasajero(Pasajero pasajero) {
		colaPasajero.add(pasajero);
	}
	
	public float reporteVueloXTiquete() {
		float totalReporteVueloXTiquete=0;
		
		
		for(Pasajero pasajero : colaPasajero) {
			
			totalReporteVueloXTiquete = totalReporteVueloXTiquete + pasajero.valorTiquete;
		}
		
		return totalReporteVueloXTiquete;
		
	}
	

	public float reporteVueloXValorMaleta() {
		float totalReporteVueloXValorMaleta=0;
		
		for(Pasajero pasajero : colaPasajero) {
			totalReporteVueloXValorMaleta = totalReporteVueloXValorMaleta + pasajero.valorXMaleta;
		}
		
		return totalReporteVueloXValorMaleta;
		
	}
	
	public float totalReporteXPagos() {
		
		float totalReporteXPagos= reporteVueloXTiquete()+reporteVueloXValorMaleta(); 
		
		return totalReporteXPagos;
	}

	/*public String calcularPasajerosDiscapacitados() {
		
		Hashtable<String, Integer> hashDiscapacitados = new Hashtable<String, Integer>();
		
		for(Pasajero pasajero : colaPasajero) {
			for(String discapacidad : pasajero.ListDiscapacitados) {
				int cant = 1;
				if(hashDiscapacitados.containsKey(discapacidad)) {
					cant = hashDiscapacitados.get(discapacidad);
					cant++;
					
				}
				hashDiscapacitados.put(discapacidad, cant);
			}
		
		hashDiscapacitados.forEach((key, value) -> {
			System.out.println(key + "= "+ value);
		});
		}
		return "";
	}
*/
	public int calcularPasajerosDiscapacitados() {
		int cantDiscapacitados = 0;
		
		for(Pasajero pasajero : colaPasajero) {
			if (pasajero.discapacitado ==1) {
				cantDiscapacitados++;
				
			}
		}
		
		return cantDiscapacitados;
		
	}
}
