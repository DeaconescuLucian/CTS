package ro.ase.cts.command;

public class Depunere extends Command{

	public Depunere(ContBancar contbancar,float suma) {
		super(contbancar,suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		this.getContbancar().depunere(super.getSuma());
	}
 
	
}
