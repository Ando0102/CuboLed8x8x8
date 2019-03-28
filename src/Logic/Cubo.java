package Logic;

import java.util.ArrayList;
import com.pi4j.io.gpio.*; ///LIBRERIA PARA LOS GPIO PI




public class Cubo {

	private ArrayList<Animacion> seleccion;
	private ArrayList<Animacion> misAnimaciones;
	
	public Cubo() {
		super();
		this.seleccion = new ArrayList<Animacion>();
		this.misAnimaciones = new ArrayList<Animacion>();
	}

	public ArrayList<Animacion> getMisAnimaciones() {
		return misAnimaciones;
	}

	public void setMisAnimaciones(ArrayList<Animacion> misAnimaciones) {
		this.misAnimaciones = misAnimaciones;
	}

	public ArrayList<Animacion> getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(ArrayList<Animacion> seleccion) {
		this.seleccion = seleccion;
	}
	
	
	/*public Animacion BuscarAnimacionByName(int indice) {
		Animacion aux = null;
		int i = 0;
		boolean Encontrado = false;
		
		if(!misAnimaciones.isEmpty()){
			while(i<misAnimaciones.size() || Encontrado == true) {
				if(misAnimaciones.get(indice)) {
					aux = misAnimaciones.get(i);
					Encontrado = true;
				}
			}
		}
		
		return aux;
	}*/
	
	
//////////////////////////////////Parte Fundamental del Proyecto////////////////////////////////////////////////////////
	
	public void Multiplexación() {
		
	}
	
}
