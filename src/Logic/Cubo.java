package Logic;

import java.util.ArrayList;

public class Cubo {

	private Capa[] misCapas;
	private ArrayList<Capa> Animacion;
	
	public Cubo(Capa[] misCapas, ArrayList<Capa> animacion) {
		super();
		this.misCapas = misCapas;
		Animacion = animacion;
	}

	public Capa[] getMisCapas() {
		return misCapas;
	}

	public void setMisCapas(Capa[] misCapas) {
		this.misCapas = misCapas;
	}

	public ArrayList<Capa> getAnimacion() {
		return Animacion;
	}

	public void setAnimacion(ArrayList<Capa> animacion) {
		Animacion = animacion;
	}
	
	
}
