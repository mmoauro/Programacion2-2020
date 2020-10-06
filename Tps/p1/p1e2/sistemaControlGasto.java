package p1e2;
public class sistemaControlGasto {
	private Provincia[] provincias;
	
	public void ciudadesEnDeficit () {
		for (int i = 0; i < provincias.length; i++) {
			provincias[i].ciudadesEnDeficit();
		}
	}
	
	public void provinciasEnDeficit () {
		for (int i = 0; i < provincias.length; i++) {
			if(provincias[i].estaEnDeficit()) {
				System.out.println(provincias[i].toString() + "Esta en deficit capo \n");
			}
		}
	}
	
	public sistemaControlGasto (Provincia [] provincias) {
		this.provincias = provincias;
	}
}


