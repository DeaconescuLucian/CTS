package ro.ase.cts.main;

import ro.ase.cts.classes.IOptiuniMeniu;
import ro.ase.cts.classes.Sectiune;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IOptiuniMeniu meniu=new Sectiune("meniu");
		
		IOptiuniMeniu opt1=new Sectiune("bauturi");
		IOptiuniMeniu opt2=new Sectiune("desert");
		
		IOptiuniMeniu item1=new Sectiune("apa minerala");
		IOptiuniMeniu item2=new Sectiune("frappe");
		IOptiuniMeniu item3=new Sectiune("papanas");
		
		opt1.addNode(item1);
		opt1.addNode(item2);
		opt2.addNode(item3);
		
		meniu.addNode(opt1);
		meniu.addNode(opt2);
		meniu.descriere();
		
		opt1.stergeNode(item2);
		opt2.addNode(item2);
		
		meniu.descriere();
	}

}
