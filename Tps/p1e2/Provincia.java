package p1e2;
public class Provincia {
	private Ciudad [] ciudades;
	
	public Provincia(Ciudad [] ciudades) {
		this.ciudades = ciudades;
	}

	public boolean estaEnDeficit () {
		int deficit = 0;
		for (int i = 0; i < ciudades.length; i++) {
			if (ciudades[i].estaEnDeficit()) {
				deficit++;
			}
		}
		return deficit >= (ciudades.length / 2);
	}
	
	public void ciudadesEnDeficit() {
		for (int i = 0; i < ciudades.length; i++) {
			if (ciudades[i].estaEnDeficit()) {
				System.out.println(ciudades[i].getNombre().toString() + " Esta en defricit REY \n");
			}
		}
	}
}
