package p2e1;
public class Pasaje {
	private Aerolinea aerolinea;
	private String destino;
	private int fecha;
	private boolean premium;
	private boolean pasillo;
	private boolean estaLleno;
	
	public Pasaje(String destino, int fecha, boolean premium, boolean pasillo) {
		this.destino = destino;
		this.fecha = fecha;
		this.premium = premium;
		this.pasillo = pasillo;
		this.estaLleno = false;
	}
	public boolean getEstaLleno() {
		return this.estaLleno;
	}
	public void setEstaLleno () {
		this.estaLleno = true;
	}
	public void setPremium () {
		this.premium = true;
	}
	public void setVentana () {
		this.pasillo = true;
	}
	public String getDestino() {
		return this.destino;
	}
	public int getFecha () {
		return this.fecha;
	}
	public boolean getPremium () {
		return this.premium;
	}
	public boolean getPasillo () {
		return this.pasillo;
	}
	public void setAerolinea (Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public Aerolinea getAerolinea() {
		return this.aerolinea;
	}
	
}
