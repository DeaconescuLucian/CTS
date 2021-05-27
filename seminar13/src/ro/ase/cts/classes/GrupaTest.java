package ro.ase.cts.classes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GrupaTest {

	@Test
	public void constructorTest() {
		Grupa grupa=new Grupa(1055);
		Assert.assertEquals(1055,grupa.getNrGrupa());
	}
	
	@Test
	public void limitaInfTest() {
		Grupa grupa=new Grupa(1000);
		Assert.assertEquals(1000,grupa.getNrGrupa());
	}
	
	@Test
	public void limitaSupTest() {
		Grupa grupa=new Grupa(1100);
		Assert.assertEquals(1100,grupa.getNrGrupa());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void inAfaraLimitelorTest()
	{
		Grupa grupa=new Grupa(1300);
	}
	
	@Test(timeout=1000) public void prefromantaTest()
	{
		Grupa grupa=new Grupa(1100);
	}
	
	@Test public void promovabilitateTest()
	{
		Grupa grupa=new Grupa(1079);
		for(int i=1;i<11;i++)
		{
			Student student=new Student();
			student.adaugaNota(i);
			grupa.adaugaStudent(student);
		}
		Assert.assertEquals(0.6f,grupa.getPromovabilitate(),0.01f);
	}
	
	@Test
	public void testListaLimInf() {
		Grupa g=new Grupa(1004);
		for(int i=0;i<10;i++) {
			
			Student stud=new Student();
			stud.adaugaNota(3);
			g.adaugaStudent(stud);
		}
		assertEquals(0f,g.getPromovabilitate(),.01f);
		
	}
	@Test
	public void testListaLimSup() {
		Grupa g=new Grupa(1004);
		for(int i=0;i<10;i++) {
			
			Student stud=new Student();
			stud.adaugaNota(7);
			g.adaugaStudent(stud);
		}
		assertEquals(1f,g.getPromovabilitate(),.01f);
		
	}
	
	@Test
	public void CardinalitiPromovabilitateTest() {
		Grupa g=new Grupa(1004);
		Student stud=new Student();
		stud.adaugaNota(7);
		g.adaugaStudent(stud);
		assertEquals(1f,g.getPromovabilitate(),.01f);
	}
}
