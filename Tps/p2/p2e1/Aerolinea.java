package p2e1;
public class Aerolinea {
	private String nombre;
	private Pasaje [] pasajes;
	
	public Aerolinea (String nombre, Pasaje [] pasajes) {
		this.nombre = nombre;
		this.pasajes = pasajes;
	}
	public void buscarPasaje (Pasaje pasaje) {
		for (Pasaje pasajeDispo : pasajes) {
			if (pasajeDispo.getDestino() == pasaje.getDestino() && pasajeDispo.getFecha() == pasaje.getFecha() 
					&& !pasajeDispo.getEstaLleno() 
					&& pasaje.getAerolinea() == this && pasajeDispo.getPasillo() == pasaje.getPasillo() 
					&& pasajeDispo.getPremium() == pasaje.getPremium()) {
				System.out.println("Pasaje disponible el dia " + pasajeDispo.getFecha() + " compania: " + this.nombre);
			}
		}
	}
	public String getNombreString () {
		return this.nombre;
	}
}
