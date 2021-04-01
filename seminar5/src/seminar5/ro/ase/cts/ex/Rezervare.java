package seminar5.ro.ase.cts.ex;

public class Rezervare {
	private boolean mancare;
	private boolean scaun;
	private boolean muzica;
	private boolean bautura;
	private String genMuzica;
	private int cod;
	
	public Rezervare(RezervareBuilder builder) {
		super();
		this.mancare = builder.mancare;
		this.scaun = builder.scaun;
		this.muzica = builder.muzica;
		this.bautura = builder.bautura;
		this.genMuzica = builder.genMuzica;
		this.cod = builder.cod;
	}

	public static RezervareBuilder builder() {
        return new RezervareBuilder();
    }
	
	public static class RezervareBuilder implements Builder{
		private boolean mancare;
		private boolean scaun;
		private boolean muzica;
		private boolean bautura;
		private String genMuzica;
		private int cod;
		
		public RezervareBuilder setMancare(boolean mancare) {
			this.mancare = mancare;
			return this;
		}

		public RezervareBuilder setScaun(boolean scaun) {
			this.scaun = scaun;
			return this;
		}

		public RezervareBuilder setMuzica(boolean muzica) {
			this.muzica = muzica;
			return this;
		}

		public RezervareBuilder setBautura(boolean bautura) {
			this.bautura = bautura;
			return this;
		}

		public RezervareBuilder setGenMuzica(String genMuzica) {
			this.genMuzica = genMuzica;
			return this;
		}

		public RezervareBuilder setCod(int cod) {
			this.cod = cod;
			return this;
		}

		@Override
		public Rezervare build() {
			// TODO Auto-generated method stub
			return new Rezervare(this);
		}

	}

	public boolean isMancare() {
		return mancare;
	}

	public void setMancare(boolean mancare) {
		this.mancare = mancare;
	}

	public boolean isScaun() {
		return scaun;
	}


	public void setScaun(boolean scaun) {
		this.scaun = scaun;
	}

	public boolean isMuzica() {
		return muzica;
	}

	public void setMuzica(boolean muzica) {
		this.muzica = muzica;
	}

	public boolean isBautura() {
		return bautura;
	}



	public void setBautura(boolean bautura) {
		this.bautura = bautura;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "Rezervare [mancare=" + mancare + ", scaun=" + scaun + ", muzica=" + muzica + ", bautura=" + bautura
				+ ", genMuzica=" + genMuzica + ", cod=" + cod + "]";
	}
	
	
}
