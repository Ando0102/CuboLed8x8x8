package Logic;

public class Led {

	private float tiempoON;
	private boolean Estado;
	
	public Led(float tiempoON, boolean estado) {
		super();
		this.tiempoON = tiempoON;
		Estado = estado;
	}

	public float getTiempoON() {
		return tiempoON;
	}

	public void setTiempoON(float tiempoON) {
		this.tiempoON = tiempoON;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}
	
	
	
	
}
