package seminar4.ro.ase.cts.classes.main;

import seminar4.ro.ase.cts.classes.factorymethod.Categorie;
import seminar4.ro.ase.cts.classes.factorymethod.FactoryBody;
import seminar4.ro.ase.cts.classes.factorymethod.FactoryCategorie;
import seminar4.ro.ase.cts.classes.factorymethod.FactoryGripa;

public class programFactoryMethod {
	
	public static FactoryCategorie getTipFactory()
	{
		return new FactoryGripa();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie,float pretDeBaza)
	{
		Categorie categorie=factoryCategorie.createCategorie(pretDeBaza);
		System.out.println(categorie.toString());
	}
	
	public static void main(String[] args) {
		
		printeazaCategorie(getTipFactory(),10);
	}
}
