package Logic;

public class Animacion {

	private Capa[] capas;
	private String nombre;
	private String descripcion;

	
	public Animacion( String nombre, String descripcion) {
		super();
		this.capas = new Capa[8];
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Capa[] getCapas() {
		return capas;
	}

	public void setCapas(Capa[] capas) {
		this.capas = capas;
	}
	
/*	public void ingresarCapas(Capa[] capas) {
		
		for(int i = 0; i<8; i++) {
			this.capas[i] = capas[i];
		}
	}
*/	
}
