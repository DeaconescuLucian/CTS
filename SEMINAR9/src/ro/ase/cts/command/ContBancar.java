package ro.ase.cts.command;

public class ContBancar {
	private String detinator;
	private float suma;
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.suma = 0;
	}
	
	public void constituire(float suma)
	{
		System.out.println("Contul a fost constiutiut pt "+detinator);
		this.suma=suma;
	}
	
	public void retragere(float suma)
	{
		if(this.suma>=suma)
		{
			this.suma=this.suma-suma;
			System.out.println("Au fost retrasi "+suma+" lei");
		}
		else
		{
			System.out.println("Fonduri insuficiente");
		}
	}
	
	public void depunere(float suma)
	{
		this.suma+=suma;
		System.out.println("au fost depusi "+suma+" lei.");
	}
}
