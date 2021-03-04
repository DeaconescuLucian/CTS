package ro.ase.cts.readers;

public class AplicantReader {
	public String FileName;

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public AplicantReader(String fileName) {
		super();
		FileName = fileName;
	}
	
	
}
