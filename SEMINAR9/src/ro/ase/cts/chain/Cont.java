package ro.ase.cts.chain;

public abstract class Cont {
	private float sold;
	private String client;
	private Cont succesor;
	
	public Cont(float sold, String client, Cont succesor) {
		super();
		this.sold = sold;
		this.client = client;
		this.succesor = succesor;
	}
	
	
	
	public float getSold() {
		return sold;
	}



	public String getClient() {
		return client;
	}



	public Cont getSuccesor() {
		return succesor;
	}



	public abstract void plateste(float suma);
}
