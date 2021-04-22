package ro.ase.cts.state2;

public class Masa {
	private int nrMasa;
	private Stare stare;
	
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare=new StareLibera();
		
	}
	
	public void rezervaMasa()
	{
		if(stare instanceof StareLibera)
		{
			stare=new StareRezervata();
			stare.afiseazaDescriere();
		}
	}
	
	public void elibereazaMasa()
	{
		if(!(stare instanceof StareLibera))
		{
			stare=new StareLibera();
			stare.afiseazaDescriere();
		}
	}
	
	public void ocupaMasa()
	{
		if(!(stare instanceof StareOcupata))
		{
			stare=new StareOcupata();
			stare.afiseazaDescriere();
		}
	}
	
}
