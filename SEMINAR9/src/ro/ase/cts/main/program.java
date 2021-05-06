package ro.ase.cts.main;

import ro.ase.cts.command.Constituire;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.Depunere;
import ro.ase.cts.command.ManagerComenzi;
import ro.ase.cts.command.Retragere;

public class program {

	public static void main(String[] args) {
		
		ManagerComenzi managerComenzi=new ManagerComenzi();
		ContBancar cont=new ContBancar("Eu");
		managerComenzi.invoca(new Constituire(cont,500));
		managerComenzi.invoca(new Depunere(cont,300));
		managerComenzi.invoca(new Retragere(cont,600));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}
