package ro.ase.cts.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuniMeniu {
	
	List<IOptiuniMeniu> lista;
	private String numeSectiune;
	public Sectiune(String numeSectiune) {
		
		super();
		this.lista=new ArrayList<IOptiuniMeniu>();
		this.numeSectiune = numeSectiune;
	}
	@Override
	public void addNode(IOptiuniMeniu optiune) {
		lista.add(optiune);
		
	}
	@Override
	public void stergeNode(IOptiuniMeniu optiune) {
		lista.remove(optiune);
		
	}
	@Override
	public IOptiuniMeniu getNode(int index) {
		return lista.get(index);
	}
	@Override
	public void descriere() {
		System.out.println("Sectiune: "+this.numeSectiune);
		for(IOptiuniMeniu optiune: lista)
		{
			optiune.descriere();
		}
	}
	
	
	
	
}
