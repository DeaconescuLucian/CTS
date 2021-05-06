package ro.ase.cts.chain;

public class ContCurent extends Cont{

	public ContCurent(float sold, String client, Cont succesor) {
		super(sold, client, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma)
		{
			System.out.println(super.getClient()+" a platit "+ suma+" din contul curent");
		}
		else
		{
			super.getSuccesor().plateste(suma);
		}
		
	}

}
