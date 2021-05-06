package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	
	List<Command> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<Command>();
	}
	
	public void invoca(Command comanda)
	{
		this.comenzi.add(comanda);
	}
	
	public void executaComanda()
	{
		if(this.comenzi.size()>0)
		{
			this.comenzi.get(0).executa();
			this.comenzi.remove(0);
		}
	}
}
