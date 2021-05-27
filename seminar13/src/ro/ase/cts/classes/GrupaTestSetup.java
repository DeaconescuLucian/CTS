package ro.ase.cts.classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GrupaTestSetup {

	Grupa grupa ;
	
	@Before
	public void setUp() throws Exception {
		 grupa = new Grupa(1050);
			for(int i=0;i<35;i++) {
				
				Student stud=new Student();
				stud.adaugaNota(7);
				grupa.adaugaStudent(stud);
			}
	}
	
	@Test(timeout = 1000)
	public void performantaTestPromovabilitate() {
		
		grupa.getPromovabilitate();
	}

}
