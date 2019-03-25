package Logic;

public class Capa {

	private Led[] misLed;

	public Capa() {
		super();
		this.misLed = new Led[64];
	}

	public Led[] getMisLed() {
		return misLed;
	}

	public void setMisLed(Led[] misLed) {
		this.misLed = misLed;
	}
	
	

}
