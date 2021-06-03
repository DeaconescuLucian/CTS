package ro.ase.cts.classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCaseDummy {
	private IStudent studentDummy;
	
	@Before
	public void setUp() throws Exception {
		studentDummy=new StudentDummy();
	}

	@Test
	public void testAdaugaStudent() {
		
		Grupa grupa=new Grupa(1003);
		grupa.adaugaStudent(studentDummy);
		grupa.adaugaStudent(studentDummy);
		
		assertEquals(2,grupa.getStudenti().size());
	}

}
