package daten;
import java.util.Date;

public class Student extends Person implements Comparable<Student> {

	public Student(String firstName, String lastName) {
		this(firstName, lastName, false);
	}

	public Student(String firstName, String lastName, boolean selfEntitled) {
		super(firstName, lastName);
		setSelfEntitled(selfEntitled);
	}
	public Student(String firstName,String lastName,Date birthDate){
		super(firstName, lastName);	
	}
	
	public void setBirtDate(Date birthDate) {
		if (birthDate == null) {
			throw new IllegalArgumentException("birthDate must not be null!");
		}
		
		this.birthDate = birthDate;
	}
	
	public Date getBirthDate(Date birthDate) {
		return birthDate;
	}

	private boolean selfEntitled;
	private Date birthDate; // TODO add getter,setter,Constructors

	public void setSelfEntitled(boolean selfEntitled) {
		this.selfEntitled = selfEntitled;
	}

	@Override
	public int compareTo(Student o) {
		int result = 0;

		// TODO implement meaningful unit tests
		if ((result = getLastName().compareTo(o.getLastName())) == 0) {
			if ((result = getFirstName().compareTo(o.getFirstName())) == 0) {
				result = birthDate.compareTo(o.birthDate); // TODO change to
															// getter after
															// implementation
			}
		}
		return result;
	}
	
	public void sortStudents(Student x , Student y){
		
	}

	@Override
	public String toString() {
		String a = super.getFirstName();
		String b = super.getFirstName();
		return super.getLastName() + super.getFirstName() ;
		
	}
}
