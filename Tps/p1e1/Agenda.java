package p1e1;
public class Agenda {
	private Reunion [] reuniones;

	public Agenda(Reunion [] reuniones) {
		this.reuniones = reuniones;
			
		
	}
	public String toString(){
		String s = "";
		for (int i = 0; i < reuniones.length; i++) {
			s+=reuniones[i].toString()+"\n";
		}
		return s;
	}
}