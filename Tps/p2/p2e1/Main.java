package p2e1;

public class Main {
	public static void main(String[] args) {
		Pasaje pasaje1 = new Pasaje("Iguazu", 30, false, false);
		Pasajero manuel = new Pasajero("Manuel"); 
		Pasaje [] pasajes = {pasaje1}; // Cargo todos los pasajes en un arreglo
		Aerolinea lan = new Aerolinea("Lan", pasajes); 
		Aerolinea argentina = new Aerolinea("Aerolineas Argentinas", pasajes); // Creo una aerolinea nueva
		Aerolinea [] aerolineas = {lan, argentina}; // Arreglo con todas las aerolineas;
		manuel.pasajeARequerir("Iguazu", 30, aerolineas, false, false); //Solicita pasaje a iguazu, el dia 30, compania lan, asiento economico en la ventana.
	}
}
