package seminar4.ro.ase.cts.classes.factorymethod;

public abstract class Categorie {
	public float pretDeBaza;

	public Categorie(float pretDeBaza) {
		super();
		this.pretDeBaza = pretDeBaza;
	}

	public float getPretDeBaza() {
		return pretDeBaza;
	}

	public void setPretDeBaza(float pretDeBaza) {
		this.pretDeBaza = pretDeBaza;
	}
	
	
}