package seminar4.ro.ase.cts.classes.factorymethod;

public class FactoryDurere implements FactoryCategorie {

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Durere(pretDeBaza);
	}

}
