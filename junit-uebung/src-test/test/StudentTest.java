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
		Student x = new Student("Max","NichtMusstermann",new Date(Date.parse("16.10.1995")));
		Student y = new Student("Max","Mustermann",new Date(Date.parse("15.10.1995")));
		assertEquals(x.compareTo(y),1);
	}
	
	public void toStringTest(){
		Student x = new Student("Max","Mayer",new Date(Date.parse("11.9.2001")));
		Student y = new Student("Lukas","NichMayer",new Date(Date.parse("14.3.1991")));
		Student sortedfirst = null;
		Student sortedsecond = null;
		
		if(x.toString().compareTo(y.toString()) > 0){
			x = sortedfirst;
			y = sortedsecond;
		}
		else
		{
			x = sortedsecond;
			y = sortedfirst;
		}
	}

}
