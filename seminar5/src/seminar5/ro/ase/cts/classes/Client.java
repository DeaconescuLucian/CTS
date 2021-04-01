package seminar5.ro.ase.cts.classes;

public class Client implements AbstractPrototype {
	
	private int codClient;
	private String nume;
	private int varsta;
	public Client(int codClient, String nume, int varsta) {
		super();
		//validam cacaturi
		this.codClient = codClient;
		this.nume = nume;
		this.varsta = varsta;
	}
	
	private Client()
	{
		this.codClient=1;
		this.nume="Jumbo";
		this.varsta=14;
	}
	@Override
	public String toString() {
		return "Client [codClient=" + codClient + ", nume=" + nume + ", varsta=" + varsta + "]";
	}
	@Override
	public AbstractPrototype copiaza() {
		Client client=new Client();
		client.codClient=this.codClient;
		client.nume=this.nume;
		client.varsta=this.varsta;
		
		return client;
	}
	
	
}
