package ro.ase.cts.classes2;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
	
	private Map<String,FlyweightAbstract> clienti;

	public FabricaRezervari() {
		super();
		this.clienti = new HashMap<String,FlyweightAbstract>();
	}
	
	public FlyweightAbstract getClient(String email)
	{
		FlyweightAbstract client=clienti.get(email);
		if(client!=null)
		{
			client=new Client("Ciucurel","0838389394",email);
			clienti.put(email,client);
		}
		return client;
	}
	
}
