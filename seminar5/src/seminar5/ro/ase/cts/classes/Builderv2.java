package seminar5.ro.ase.cts.classes;

public class Builderv2 implements IBuilder{
	
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaInclusa;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	
	public Builderv2(int codRezervare)
	{
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.bauturaInclusa = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "jazz";
		this.codRezervare = codRezervare;
	}
	
	
	
	public Builderv2 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}




	public Builderv2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}




	public Builderv2 setBauturaInclusa(boolean bauturaInclusa) {
		this.bauturaInclusa = bauturaInclusa;
		return this;
	}




	public Builderv2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}




	public Builderv2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}




	public Builderv2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}




	@Override
	public Rezervare build() {
		Rezervare rezervare=new Rezervare(this.mancareInclusa,this.scaunErgonomic,this.bauturaInclusa,this.muzicaAmbientala,this.genMuzica,this.codRezervare);
		return rezervare;
	}
	
	

}
