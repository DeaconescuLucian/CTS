package seminar5.ro.ase.cts.classes;

public class Bilet implements AbstractPrototype {
	private int cod;
	private String echipa;
	private String echipa2;
	private String data;
	public Bilet(int cod, String echipa, String echipa2, String data) {
		super();
		this.cod = cod;
		this.echipa = echipa;
		this.echipa2 = echipa2;
		this.data = data;
	}
	public Bilet() {
		
	}
	@Override
	public String toString() {
		return "Bilet [cod=" + cod + ", echipa=" + echipa + ", echipa2=" + echipa2 + ", data=" + data + "]";
	}
	
	
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	@Override
	public AbstractPrototype copiaza()
	{
		Bilet bilet=new Bilet();
		bilet.setCod(this.cod);
		bilet.data=this.data;
		bilet.echipa=this.echipa;
		bilet.echipa2=this.echipa2;
		return bilet;
	}
	
	
}
