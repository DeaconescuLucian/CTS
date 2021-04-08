package ro.ase.cts.classes;

public class AdapterDeClaseCredit extends Leasing implements InterfataCredit {

	public AdapterDeClaseCredit()
	{
		super();
	}
	
	@Override
	public void acordaCredit(String numeClient, float suma) {
		
		super.oferaLeasing(numeClient, suma);
		
	}

}
