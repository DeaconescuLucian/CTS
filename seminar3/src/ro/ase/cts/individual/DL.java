package ro.ase.cts.individual;

import ro.ase.cts.individual.DL;

public class DL {
	
	private int bileteCastigatoare;
	private String pacaneauaPreferata;
	private float celMaiMareMultiplicator;
	private static DL instance=null;
	
	
	
	private DL(int bileteCastigatoare, String pacaneauaPreferata, float celMaiMareMultiplicator) {
		this.bileteCastigatoare = bileteCastigatoare;
		this.pacaneauaPreferata = pacaneauaPreferata;
		this.celMaiMareMultiplicator = celMaiMareMultiplicator;
	}

	public static synchronized DL getInstance(int bileteCastigatoare, String pacaneauaPreferata, float celMaiMareMultiplicator)
	{
		if(instance==null)
			instance=new DL(bileteCastigatoare,pacaneauaPreferata,celMaiMareMultiplicator);
		return instance;
	}

	public int getBileteCastigatoare() {
		return bileteCastigatoare;
	}

	public void setBileteCastigatoare(int bileteCastigatoare) {
		this.bileteCastigatoare = bileteCastigatoare;
	}

	
	
	@Override
	public String toString() {
		return "DL [bileteCastigatoare=" + bileteCastigatoare + ", pacaneauaPreferata=" + pacaneauaPreferata
				+ ", celMaiMareMultiplicator=" + celMaiMareMultiplicator + "]";
	}

	public String getPacaneauaPreferata() {
		return pacaneauaPreferata;
	}

	public void setPacaneauaPreferata(String pacaneauaPreferata) {
		this.pacaneauaPreferata = pacaneauaPreferata;
	}

	public float getCelMaiMareMultiplicator() {
		return celMaiMareMultiplicator;
	}

	public void setCelMaiMareMultiplicator(float celMaiMareMultiplicator) {
		this.celMaiMareMultiplicator = celMaiMareMultiplicator;
	}
}

	