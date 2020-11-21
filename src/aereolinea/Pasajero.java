package aereolinea;

import java.util.ArrayList;

public class Pasajero implements Comparable<Pasajero>{
	
	String nombre;
	int id;
	float valorTiquete;
	float valorXMaleta;
	int discapacitado; //0.No 1. Si
	ArrayList<String> ListDiscapacitados = new ArrayList<String>();

	
	public int compareTo(Pasajero pasajero) {
		return pasajero.discapacitado - this.discapacitado ;
	}
	

}
