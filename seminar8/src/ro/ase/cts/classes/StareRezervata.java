package ro.ase.cts.classes;

public class StareRezervata implements StareMasa{
	
	@Override
	public void modificaStare(Masa masa) {
		
		if(masa.getStareMasa() instanceof StareLibera)
		{
			masa.setStareMasa(this);
			System.out.println("A-ti rezervat masa cu numarul "+ masa.getNrMasa());
			
		}
		else
			System.out.println("Masa nu e disponibila");
	}
	
}
