package p1e2;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private int poblacion;
	private int imp1, imp2, imp3, imp4, imp5;
	private int gasto;
	private ArrayList<ContribuyenteSimple> contribuyentes;
	
	private int getRecaucacion () {
		return imp1 + imp2 + imp3 + imp4 + imp5;
	}

	public boolean estaEnDeficit () {
		return poblacion > 100000 && getRecaucacion() < gasto;
	}
	public Ciudad(String nombre, int poblacion, int imp1, int imp2, int imp3, int imp4, int imp5, int gasto) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.imp1 = imp1;
		this.imp2 = imp2;
		this.imp3 = imp3;
		this.imp4 = imp4;
		this.imp5 = imp5;
		this.gasto = gasto;
	}
	public String getNombre () {
		return this.nombre;
	}
}
