package seminar5.ro.ase.cts.classes;

public class Rezervare {
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaInclusa;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaInclusa, boolean muzicaAmbientala,
			String genMuzica, int codRezervare) {
		super();
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaInclusa = bauturaInclusa;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}
	public boolean isMancareInclusa() {
		return mancareInclusa;
	}
	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}
	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}
	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}
	public boolean isBauturaInclusa() {
		return bauturaInclusa;
	}
	public void setBauturaInclusa(boolean bauturaInclusa) {
		this.bauturaInclusa = bauturaInclusa;
	}
	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}
	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	@Override
	public String toString() {
		return "Rezervare [mancareInclusa=" + mancareInclusa + ", scaunErgonomic=" + scaunErgonomic
				+ ", bauturaInclusa=" + bauturaInclusa + ", muzicaAmbientala=" + muzicaAmbientala + ", genMuzica="
				+ genMuzica + ", codRezervare=" + codRezervare + "]";
	}
	
	
}
