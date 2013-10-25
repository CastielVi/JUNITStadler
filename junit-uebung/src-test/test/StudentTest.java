package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import daten.Student;

public class StudentTest {

	@Test
	public void Studenttest() {
		Student s = new Student("Max","Mustermann");
		assertSame("Max", s.getFirstName());
		assertSame("Mustermann", s.getLastName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void StudentNull(){
		Student s = new Student(null,null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Studentopentest(){
		Student s = new Student("","");
	}
	
	@Test
	public void CompareToTest(){
		Student x = new Student("Max","Mustermann",new Date(Date.parse("16.10.1995")));
		Student y = new Student("Max","Mustermann",new Date(Date.parse("16.10.1995")));
		assertEquals(x.compareTo(y),0);
	}
	
	@Test
	public void toStringSortTest(){
	
	}

}
