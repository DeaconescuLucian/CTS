package ro.ase.cts.classes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class GrupaFakeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Category(NormalTests.class)
	public void testAreRestante() {
		
		IStudent student1=new FakeStudent("fdfsd",7.6f,false);
		IStudent student2=new FakeStudent("fdfsd",7.6f,false);
		IStudent student3=new FakeStudent("fdfsd",7.6f,false);
		IStudent student4=new FakeStudent("fdfsd",3.6f,true);
		
		Grupa grupa=new Grupa(1010);
		grupa.adaugaStudent(student4);
		grupa.adaugaStudent(student1);
		grupa.adaugaStudent(student2);
		grupa.adaugaStudent(student3);
		
		assertEquals(0.75f,grupa.getPromovabilitate(),0.001);
	}
	@Test
	@Category(UrgentTests.class)
	public void testNuAreRestante() {
		
		IStudent student1=new FakeStudent("fdfsd",7.6f,true);
		IStudent student2=new FakeStudent("fdfsd",7.6f,true);
		IStudent student3=new FakeStudent("fdfsd",7.6f,true);
		IStudent student4=new FakeStudent("fdfsd",3.6f,true);
		
		Grupa grupa=new Grupa(1010);
		grupa.adaugaStudent(student4);
		grupa.adaugaStudent(student1);
		grupa.adaugaStudent(student2);
		grupa.adaugaStudent(student3);
		
		assertEquals(0f,grupa.getPromovabilitate(),0.001);
	}

}
