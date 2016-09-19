package a4;

public class Person {

	private String firstName;
	private String lastName;
	private String birthday;
	private static Person instance = null;

	private Person() {
	}

	public static Person getInstance() {
		if(instance == null) {
			
			instance = new Person();
		}
		
		return instance;
	}

	public Person withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Person withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public Person bornOn(String birthday) {
		this.birthday = birthday;
		return this;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
	}
	
}
