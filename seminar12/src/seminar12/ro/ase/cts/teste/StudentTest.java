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
	
	@Test
	public void testMedieMultipleNote() {
		Student student=new Student();
		int nota=8;
		int nota2=9;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertEquals(8.5f,student.calculeazaMedie(),0.001f);
		
	}
	
	
	@Test
	public void testMedieFaraNote() {
		Student student=new Student();
		assertEquals(0f,student.calculeazaMedie(),0.001f);
		
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void testVerificaGetNota() {
		Student student=new Student();
		int nota=8;
		int nota2=9;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertEquals(nota,student.getNota(-1)) ;
		
	}
	
	@Test 
	public void testVerificaGetNotaJU3() {
		Student student=new Student();
		int nota=8;
		
		student.adaugaNota(nota);
		
		try { int s=student.getNota(-1) ;
		fail("Aici nu trebuie sa ajungem");}
			catch(IndexOutOfBoundsException eroare) {
				
			}
		
		
	}
	
	@Test
	public void testVerificaRestanta() {
		Student student=new Student();
		int nota1=8;
		int nota2=3;
		int nota3=8;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertTrue(student.areRestante()) ;
	}
	
	
	@Test
	public void testVerificaRestantaFalse() {
		Student student=new Student();
		int nota1=8;
		int nota2=6;
		int nota3=8;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertFalse(student.areRestante()) ;
	}

}
