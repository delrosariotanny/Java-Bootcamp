
public class Person {
	String firstname;
	String lastname;
	int age;
	
	public Person() {
		this(null);
	}
	
	public Person(String firstname) {
		this(firstname, null);
	}
	
	public Person(String firstname, String lastname) {
		this(firstname, lastname, 0);
	}
	
	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
}
