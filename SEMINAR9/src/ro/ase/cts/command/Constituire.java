package ro.ase.cts.command;

public class Constituire extends Command {

	
	public Constituire(ContBancar contbancar,float suma) {
		super(contbancar,suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getContbancar().constituire(super.getSuma());
	}

}
