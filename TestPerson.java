package a4;

public class TestPerson {

	public static void main(String[] args) {

		Person person = Person.getInstance().withFirstName("Joe").withLastName("Doe").bornOn("18.03.1980");

		System.out.println(person.toString());
	}

}
