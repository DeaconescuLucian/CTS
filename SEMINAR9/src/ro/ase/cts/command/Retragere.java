package ro.ase.cts.command;

public class Retragere extends Command {

	public Retragere(ContBancar contbancar,float suma) {
		super(contbancar,suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		this.getContbancar().retragere(super.getSuma());
	}
	
	
	
}
