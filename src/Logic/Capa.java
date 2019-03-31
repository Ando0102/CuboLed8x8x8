package Logic;

public class Capa {

	private boolean[] misLed;

	public Capa() {
		super();
		this.misLed = new boolean[64];
		for (int i = 0; i < 64; i++) {
			misLed[i] = false;
		}
	}

	public boolean[] getMisLed() {
		return misLed;
	}

	public void setMisLed(boolean[] misLed) {
		this.misLed = misLed;
	}

	public void modificadorLed(int ledElegido) {
		
		if(!misLed[ledElegido]) {
			
		misLed[ledElegido] = true;
		}
		else {
			misLed[ledElegido] = false;
		}
	}
	
	

	
	

}
