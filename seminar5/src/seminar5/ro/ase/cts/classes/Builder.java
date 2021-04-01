package seminar5.ro.ase.cts.classes;

public class Builder implements IBuilder {
	
	private Rezervare rezervare;
	
	public Builder()
	{
		rezervare=new Rezervare(false,false,false,false,"trapanele",5);
		
	}
	
	public Builder(int cod)
	{
		rezervare=new Rezervare(false,false,false,false,"trapanele",cod);
		
	}
	

	public Builder setMancareInclusa(boolean mancareInclusa) {
		rezervare.setMancareInclusa(mancareInclusa);
		return this;
	}

	public Builder setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}

	public Builder setBauturaInclusa(boolean bauturaInclusa) {
		rezervare.setBauturaInclusa(bauturaInclusa);
		return this;
	}

	public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
		rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}

	public Builder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	public Builder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}


	@Override
	public Rezervare build() {
		return rezervare;
	}
}
