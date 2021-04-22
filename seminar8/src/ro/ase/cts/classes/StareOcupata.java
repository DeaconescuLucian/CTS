package ro.ase.cts.classes;

public class StareOcupata implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareOcupata))
		{
			masa.setStareMasa(this);
			System.out.println("Masa cu numarul "+masa.getNrMasa()+  " s-a ocupat");
		}
		else
		{
			System.out.println("Masa este ocupata");
		}
		
	}

}
