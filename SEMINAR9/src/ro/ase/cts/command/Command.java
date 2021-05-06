package ro.ase.cts.command;

public abstract class Command {
	private ContBancar contbancar;
	private float suma;
	
	public Command(ContBancar contbancar,float suma) {
		super();
		this.contbancar = contbancar;
		this.suma=suma;
	}
	
	public ContBancar getContbancar() {
		return contbancar;
	}
	
	public float getSuma() {
		return suma;
	}

	public abstract void executa();
}
