package p2e1;
public class Pasajero {
	private String nombre;
	
	public Pasajero(String nombre) {
		
	}
	public String getNombre() {
		return this.nombre;
	}
	public void pasajeARequerir (String destino, int fecha, Aerolinea [] aerolineas, boolean premium, boolean pasillo) {
		Pasaje usuarioPasaje = new Pasaje(destino, fecha, premium, pasillo);
		for (Aerolinea aerolinea2 : aerolineas) {
			usuarioPasaje.setAerolinea(aerolinea2);
			aerolinea2.buscarPasaje(usuarioPasaje);	
			
		}
	}
}
