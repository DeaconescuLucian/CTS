package seminar12.ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar12.ro.ase.cts.classes.Student;

public class StudentTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorRightName() {
		String nume="Ciuciulete";
		Student student=new Student(nume);
		assertEquals(nume,student.getNume());
	}
	
	@Test
	public void testAdaugareNota() {
		Student student=new Student();
		student.adaugaNota(8);
		assertEquals(8,student.getNota(0));
	}
	
	@Test
	public void testListSize() {
		Student student=new Student();
		student.adaugaNota(8);
		assertEquals(1,student.getNote().size());
	}

}
