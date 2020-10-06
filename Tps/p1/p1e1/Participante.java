package p1e1;
public class Participante {
	private String telefono;
	private String mail;
	
	public Participante(String telefono, String mail) {
		this.telefono = telefono;
		this.mail = mail;	
	}
	 public String toString(){
		  return telefono+" "+mail;  
		 }
}
