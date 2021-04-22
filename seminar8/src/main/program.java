package main;

import ro.ase.cts.classes.Card;
import ro.ase.cts.classes.Cash;
import ro.ase.cts.classes.Client;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=new Client("Popescu");
		client.setModPlata(new Cash());
		client.plateste(200.00);
		client.setModPlata(new Card(500.00));
		client.plateste(350.00);
	}

}
