package p1e3;
public class Publicacion {
	private UserFacebook autor;
	private String contenido;
	private int likes;

	public Publicacion (UserFacebook autor, String contenido, int likes) {
		this.autor = autor;
		this.contenido = contenido;
		this.likes = likes;
	}
	public int getLikes () {
		return this.likes;
	}
	public UserFacebook getAutor () {
		return this.autor;
	}
	public String getContenido () {
		return "Autor: " + this.autor.getNombre() + " Contenido: " + this.contenido + " Likes: " + this.likes;
	}

}
