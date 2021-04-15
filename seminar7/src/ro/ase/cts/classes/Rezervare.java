package ro.ase.cts.classes;

public class Rezervare implements IRezervare {
	private int nrMasa;
	private int nrPersoane;
	public Rezervare(int nrMasa, int nrPersoane) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
	}
	public int getNrPersoane() {
		return nrPersoane;
	}
	@Override
	public void anuntaRezervare() {
		// TODO Auto-generated method stub
		System.out.println("Masa cu numarul "+ nrMasa+"a fost rezervata de "+nrPersoane);
	}
	
	
}
