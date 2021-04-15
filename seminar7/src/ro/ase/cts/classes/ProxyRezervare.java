package ro.ase.cts.classes;

public class ProxyRezervare implements IRezervare {
	
	private IRezervare rezervare;
	
	
	public ProxyRezervare(IRezervare rezervare) {
		super();
		this.rezervare = rezervare;
	}


	@Override
	public void anuntaRezervare() {
		
		if(rezervare.getNrPersoane()>= 4)
			rezervare.anuntaRezervare();
		else
		{
			System.out.println("Nu e nevoie de rezervare");
		}
		
	}


	@Override
	public int getNrPersoane() {
		// TODO Auto-generated method stub
		return rezervare.getNrPersoane();
	}

}
