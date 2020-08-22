package p1e3;
public class UserFacebook {
	private String nombre;
	private int edad;
	private UserFacebook [] amigos;
	private Publicacion [] publicaciones;
	
	public UserFacebook (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public void setAmigos (UserFacebook [] amigos) {
		this.amigos = amigos;
	}
	public void setPublicaciones (Publicacion [] publicaciones) {
		this.publicaciones = publicaciones;	
	}
	public void printPublicaciones () {
		for (int i = 0; i < publicaciones.length; i++) {
			System.out.println(publicaciones[i].getContenido());
		}
	}
	public void printAmigos () {
		// esto es una prueba
		for (UserFacebook user : amigos) {
			System.out.println(user.nombre + " - " + user.edad + " anios." + " - " + user.publicaciones[0].getContenido());
		}
	}
	
	public String getNombre () {
		return this.nombre;
	}
	public int getEdad () {
		return this.edad;
	}
}
