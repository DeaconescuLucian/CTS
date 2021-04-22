package ro.ase.cts.classes;

public class Card implements ModPlata {

	private double sold;
	
	
	public Card(double sold) {
		super();
		this.sold = sold;
	}


	@Override
	public void plateste(double sumaPlatita) {
		if(sold>sumaPlatita)
		{
			System.out.println("Se plateste cu card "+sumaPlatita);
			sold-=sumaPlatita;
		}
		else
		{
			System.out.println("no funds ");
		}
		
	}
	
}
