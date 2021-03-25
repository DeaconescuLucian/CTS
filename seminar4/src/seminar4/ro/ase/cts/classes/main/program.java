package seminar4.ro.ase.cts.classes.main;

import seminar4.ro.ase.cts.classes.simplefactory.Categorie;
import seminar4.ro.ase.cts.classes.simplefactory.CategorieFactory;
import seminar4.ro.ase.cts.classes.simplefactory.CategoriiMedicale;
import seminar4.ro.ase.cts.classes.simplefactory.Durere;

public class program {

	public static CategoriiMedicale getTipCategorie()
	{
		return CategoriiMedicale.body;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			CategorieFactory factory=new CategorieFactory();
			Categorie durere=factory.creareCategorie(CategoriiMedicale.durere, 5);
			Categorie body=factory.creareCategorie(CategoriiMedicale.body, 15);
			
			System.out.println(body.toString());
			System.out.println(durere.toString());
			
			Categorie categorie=factory.creareCategorie(getTipCategorie(),5);
			System.out.println(categorie.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
