package ro.ase.cts.chain;

public class ContIndisponibil extends Cont{

	
	public ContIndisponibil(float sold, String client, Cont succesor) {
		super(sold, client, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		System.out.println("Fonduri insuficiente");
		
	}
	
	

}
