package ro.ase.cts.classes;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException
	{
		return reader.citesteAplicanti();
	}
	
	public static void main(String[] args) throws FileNotFoundException, NumberFormatException {
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader=new StudentReader("studenti.txt");
		try {
			listaAplicanti = citesteAplicanti(aplicantReader);
			for(Aplicant angajat:listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
