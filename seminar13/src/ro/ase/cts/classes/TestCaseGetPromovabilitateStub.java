package ro.ase.cts.classes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCaseGetPromovabilitateStub {

	private IStudent student=new StudentStub();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testeGetPromovabilitate() {
		Grupa grupa=new Grupa(1010);
		grupa.adaugaStudent(student);
		assertEquals(1f,grupa.getPromovabilitate(),0.01);
	}

}
