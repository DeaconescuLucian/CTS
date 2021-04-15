package ro.ase.cts.classes;

public interface IOptiuniMeniu {
	
	public void addNode(IOptiuniMeniu optiune);
	public void stergeNode(IOptiuniMeniu optiune);
	IOptiuniMeniu getNode(int index);
	void descriere();
	
}
