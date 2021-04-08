package ro.ase.cts.main;

import ro.ase.cts.classes.AdapterDeClaseCredit;
import ro.ase.cts.classes.AdapterDeObiecteCredit;
import ro.ase.cts.classes.InterfataCredit;
import ro.ase.cts.classes.Leasing;

public class program {

	public static void oferInfoCredit(InterfataCredit credit,String numeClient,float suma)
	{
		credit.acordaCredit(numeClient, suma);
	}
	
	public static void main(String[] args) {
		
		//obiecte
		Leasing leasing=new Leasing();
		AdapterDeObiecteCredit adapter=new AdapterDeObiecteCredit(leasing);
		oferInfoCredit(adapter,"dsadas",500);
		
		//clase
		AdapterDeClaseCredit adapterCredit=new AdapterDeClaseCredit();
		oferInfoCredit(adapterCredit,"dasda",40);
	}

}
