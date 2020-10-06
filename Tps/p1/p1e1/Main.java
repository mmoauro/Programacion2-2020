package p1e1;
public class Main {
	public static void main(String[] args) {
		Participante pelu = new Participante("2494578095", "pelu@gmail.com");
		Participante baru = new Participante("2123123122", "baru@gmail.com");
		Participante [] participantes = {pelu, baru};
		Reunion prog = new Reunion("Tandil", "1 hora", "Programacion", participantes);
		Reunion prog2 = new Reunion("Tandilfwefwe", "1fwefwe hora", "Programafwefwefwecion", participantes);
		Reunion [] reuniones = {prog, prog2};
		Agenda agen = new Agenda(reuniones);
		System.out.println(agen.toString());
    }
}
