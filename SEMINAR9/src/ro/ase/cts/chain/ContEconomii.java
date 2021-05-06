package ro.ase.cts.chain;

public class ContEconomii extends Cont{

	public ContEconomii(float sold, String client, Cont succesor) {
		super(sold, client, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma)
		{
			System.out.println(super.getClient()+" a platit "+ suma+" din contul de economii");
		}
		else
		{
			super.getSuccesor().plateste(suma);
		}
		
	}

}
