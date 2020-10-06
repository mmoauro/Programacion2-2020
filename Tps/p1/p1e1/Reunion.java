package p1e1;
public class Reunion {
	private String lugar;
	private String duracion;
	private String tema;
	private Participante[] participantes;
	
	public Reunion(String lugar, String duracion, String tema, Participante [] participantes) {
		this.lugar = lugar;
		this.duracion = duracion;
		this.tema = tema;
		this.participantes = participantes;
	}
	public String toString(){
		  String s = lugar+" "+duracion +" "+tema +" \n";
		  for (int i = 0; i < participantes.length; i++) {
			  s+=participantes[i].toString()+"\n";
		  }
		  return s;
	}
}
