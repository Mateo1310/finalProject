package aereolinea;

import java.util.ArrayList;

public class Aereolinea {
	
	ArrayList<Vuelo> listaVuelo = new ArrayList<Vuelo>();

	public void addVuelo(Vuelo vuelo) {
		
		listaVuelo.add(vuelo);
	}
	
	public float ValorTotalRecaudadoXVuelos() {
		float totalRecaudadoXVuelos = 0 ;
		
		for(Vuelo vuelo : listaVuelo) {
			totalRecaudadoXVuelos = totalRecaudadoXVuelos + vuelo.totalReporteXPagos();
		}
		return totalRecaudadoXVuelos;
	}
	
	public float ValorTotalRecaudadoXtiquetes() {
		float totalRecaudadoXTiquetes = 0 ;
		
		for(Vuelo vuelo : listaVuelo) {
			totalRecaudadoXTiquetes = totalRecaudadoXTiquetes + vuelo.reporteVueloXTiquete();
		}
		return totalRecaudadoXTiquetes;
	}
	
	public float ValorTotalRecaudadoXMaleta() {
		float totalRecaudadoXMaletas = 0 ;
		
		for(Vuelo vuelo : listaVuelo) {
			totalRecaudadoXMaletas = totalRecaudadoXMaletas + vuelo.reporteVueloXValorMaleta();
		}
		return totalRecaudadoXMaletas;
	}
	
	public int calcularTotalDiscapacitados() {
		int totalDiscapacitados = 0 ;
		
		for(Vuelo vuelo : listaVuelo) {
			totalDiscapacitados = totalDiscapacitados + vuelo.calcularPasajerosDiscapacitados();
		}
		return totalDiscapacitados;
	}
	
	
}
