package seminar5.ro.ase.cts.main;

import seminar5.ro.ase.cts.classes.Bilet;
import seminar5.ro.ase.cts.classes.Client;

public class program1 {

	public static void main(String[] args) {
		
		Client client=new Client(100,"Mihai",10);
		Client client2=(Client)client.copiaza();
		
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
		Bilet bilet=new Bilet(0,"e1","e2","data");
		Bilet bilet1=(Bilet)bilet.copiaza();
		bilet1.setCod(2);
		Bilet bilet2=(Bilet)bilet.copiaza();
		bilet2.setCod(3);
		
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
		
	}

}
