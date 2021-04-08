package ro.ase.cts.classes;

public class AdapterDeObiecteCredit implements InterfataCredit {
	
	private Leasing leasing;

	public AdapterDeObiecteCredit(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		
		leasing.oferaLeasing(numeClient, suma);
		
	}
	
	
	
}
