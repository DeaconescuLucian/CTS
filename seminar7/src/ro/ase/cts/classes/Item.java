package ro.ase.cts.classes;

public class Item implements IOptiuniMeniu {
	
	private String numeSectiune;

	public Item(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
	}

	@Override
	public void addNode(IOptiuniMeniu optiune) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public void stergeNode(IOptiuniMeniu optiune) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public IOptiuniMeniu getNode(int index) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Item: "+this.numeSectiune);
	}
	
	
}
