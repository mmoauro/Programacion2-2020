package p1e2;
public class Main {
	public static void main(String[] args) {
		Ciudad tandil = new Ciudad("Tandil", 150000, 102, 34, 80, 2, 0, 1312312);
		Ciudad [] ciudades = {tandil};
		Provincia bsas = new Provincia(ciudades);
		Provincia [] provincias = {bsas};
		sistemaControlGasto primero = new sistemaControlGasto(provincias);	
		primero.ciudadesEnDeficit();
	}

}
