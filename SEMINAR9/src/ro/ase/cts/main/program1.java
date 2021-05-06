package ro.ase.cts.main;

import ro.ase.cts.chain.Cont;
import ro.ase.cts.chain.ContCredit;
import ro.ase.cts.chain.ContCurent;
import ro.ase.cts.chain.ContEconomii;
import ro.ase.cts.chain.ContIndisponibil;

public class program1 {

	public static void main(String[] args) {
		
		Cont contCredit=new  ContCredit(300,"Eu",new ContIndisponibil(300,"Eu",null));
		Cont contCurent=new ContCurent(200,"Eu",contCredit);
		Cont contEcon=new ContEconomii(250,"Eu",contCurent);
		
		contEcon.plateste(301);
	}

}
