package seminar4.ro.ase.cts.classes.factorymethod;

public class FactoryGripa implements FactoryCategorie {

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Gripa(pretDeBaza);
	}

}
