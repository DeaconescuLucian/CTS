package ro.ase.cts.chain;

public class ContCredit extends Cont{

	public ContCredit(float sold, String client, Cont succesor) {
		super(sold, client, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma)
		{
			System.out.println(super.getClient()+" a platit "+ suma+" din contul credit");
		}
		else
		{
			super.getSuccesor().plateste(suma);
		}
		
	}

}
