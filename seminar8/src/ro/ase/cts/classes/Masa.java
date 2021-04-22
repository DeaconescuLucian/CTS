package ro.ase.cts.classes;

public class Masa {
	
	private StareMasa stareMasa;
	private int nrMasa;
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stareMasa=new StareLibera();
	}
	
	public StareMasa getStareMasa() {
		return stareMasa;
	}
	protected void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	
	public void rezervaMasa()
	{
		modificaStareMasa(new StareRezervata());
	}
	
	public void ocupaMasa()
	{
		StareMasa stareRezervata=new StareOcupata();
		stareRezervata.modificaStare(this);
	}
	
	public void elibereazaMasa()
	{
		StareMasa stareRezervata=new StareLibera();
		stareRezervata.modificaStare(this);
	}
	
	public void modificaStareMasa(StareMasa stare)
	{
		stare.modificaStare(this);
	}
}
