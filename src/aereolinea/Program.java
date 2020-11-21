package aereolinea;

public class Program {

	public static void main(String[] args) {
		
		Aereolinea a1 = new Aereolinea();
		
		Vuelo v1 = new Vuelo();
		v1.idVuelo="Vuelo 1";
		
		a1.addVuelo(v1);
		
		Pasajero p1 = new Pasajero();
		p1.nombre="Mateo";
		p1.id=12345;
		p1.valorTiquete=2000;
		p1.valorXMaleta=200;
		p1.discapacitado=0;
		p1.ListDiscapacitados.add("No");
		v1.colaPasajero.add(p1);
		
		Pasajero p2 = new Pasajero();
		p2.nombre="lina";
		p2.id=6789;
		p2.valorTiquete=1500;
		p2.valorXMaleta=400;
		p2.discapacitado=0;
		p2.ListDiscapacitados.add("No");
		v1.colaPasajero.add(p2);
		
		Pasajero p3 = new Pasajero();
		p3.nombre="Laura";
		p3.id=5674;
		p3.valorTiquete=2950;
		p3.valorXMaleta=500;
		p3.discapacitado=1;
		p3.ListDiscapacitados.add("Si");
		v1.colaPasajero.add(p3);
		
		Pasajero p7 = new Pasajero();
		p7.nombre="Luis";
		p7.id=5674;
		p7.valorTiquete=2950;
		p7.valorXMaleta=500;
		p7.discapacitado=1;
		p7.ListDiscapacitados.add("Si");
		v1.colaPasajero.add(p7);
		
		Vuelo v2 = new Vuelo();
		v2.idVuelo="Vuelo 2";
		a1.addVuelo(v2);
		
		Pasajero p4 = new Pasajero();
		p4.nombre="Valentina";
		p4.id=100743;
		p4.valorTiquete=8500;
		p4.valorXMaleta=2000;
		p4.discapacitado=1;
		p4.ListDiscapacitados.add("Si");
		v2.colaPasajero.add(p4);
		
		Pasajero p5 = new Pasajero();
		p5.nombre="Maria";
		p5.id=773;
		p5.valorTiquete=1500;
		p5.valorXMaleta=200;
		p5.discapacitado=1;
		p5.ListDiscapacitados.add("Si");
		v2.colaPasajero.add(p5);
		
		Pasajero p6 = new Pasajero();
		p6.nombre="Emmanuel";
		p6.id=6543;
		p6.valorTiquete=7200;
		p6.valorXMaleta=1600;
		p6.discapacitado=1;
		p6.ListDiscapacitados.add("Si");
		v2.colaPasajero.add(p6);
		
		
					
		
		float totalRecaudoTiqueteXPasajero = v1.reporteVueloXTiquete();
		System.out.println(" El recaudo por tema de tiquete en el vuelo "+v1.idVuelo+" es de: $"+totalRecaudoTiqueteXPasajero);
		float totalRecaudoMaletasXPasajero = v1.reporteVueloXValorMaleta();
		System.out.println(" El recaudo por tema de maletas en el vuelo "+v1.idVuelo+" es de: $"+totalRecaudoMaletasXPasajero);
		float totalRecaudoXVuelo = v1.totalReporteXPagos();
		System.out.println("El recaudo total en el vuelo "+v1.idVuelo+" es de: $"+totalRecaudoXVuelo);
	    int totalPasajerosDiscapacitados1 = v1.calcularPasajerosDiscapacitados();
	    System.out.println("El total de pacientes discapacitados es: "+ totalPasajerosDiscapacitados1);
	    
	    float totalRecaudoTiqueteXPasajero2 = v2.reporteVueloXTiquete();
		System.out.println("El recaudo por tema de tiquete en el vuelo "+v2.idVuelo+" es de: $"+totalRecaudoTiqueteXPasajero2);
		float totalRecaudoMaletasXPasajero2 = v2.reporteVueloXValorMaleta();
		System.out.println(" El recaudo por tema de maletas en el vuelo "+v2.idVuelo+" es de: $"+totalRecaudoMaletasXPasajero2);
		float totalRecaudoXVuelo2 = v2.totalReporteXPagos();
		System.out.println(" El recaudo total en el vuelo "+v2.idVuelo+" es de: $"+totalRecaudoXVuelo2);
	    int totalPasajerosDiscapacitados2 = v2.calcularPasajerosDiscapacitados();
	    System.out.println("El total de pacientes discapacitados es: "+ totalPasajerosDiscapacitados2);
	    
	    float totalRecaudadoXVuelos = a1.ValorTotalRecaudadoXVuelos();
	    System.out.println("El valor total recaudado por tema de vuelos es de: "+totalRecaudadoXVuelos);
	    float totalRecaudadoXTiquete = a1.ValorTotalRecaudadoXtiquetes();
	    System.out.println("El valor total recaudado por tema de tiquetes en los vuelos es de: "+totalRecaudadoXTiquete);
	    float totalRecaudadoXMaletas = a1.ValorTotalRecaudadoXMaleta();
	    System.out.println("El valor total recaudado por tema de vuelos es de: "+totalRecaudadoXMaletas);
	    int totalPasajerosDiscapacitados = a1.calcularTotalDiscapacitados();
	    System.out.println("El total de pacientes discapacitados es: "+totalPasajerosDiscapacitados);
	    
	}

}
