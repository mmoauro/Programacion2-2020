package p1e3;
public class Main {
	public static void main(String[] args) {
		UserFacebook manuel = new UserFacebook("Manuel", 18);
		UserFacebook pelu = new UserFacebook("Pelu", 30);
		UserFacebook pepito = new UserFacebook("Pepito", 30);
		Publicacion primera = new Publicacion (manuel, "dfwdwedwe", 10);
		Publicacion [] publicaciones = {primera};
		manuel.setPublicaciones(publicaciones);
		UserFacebook [] amigos = {manuel, pepito};
		pelu.setAmigos(amigos);
		manuel.printPublicaciones();
	}

	

}
