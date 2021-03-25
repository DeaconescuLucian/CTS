package seminar4.ro.ase.cts.classes.factorymethod;

public class FactoryBody implements FactoryCategorie {

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Body(pretDeBaza);
	}

}
