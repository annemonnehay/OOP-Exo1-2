
public class Person {

	// 1.8
	// attributs
	public String firstName;
	public String lastName;
	public int age;
	public String address;
	// 1.9
	public City birthCity; // ?????
//	public static String name;
//	public static String country;
//	public static int population;
	
	// constructors
	public Person(String lastName, String firstName) {
		this.firstName = firstName;
		this.lastName= lastName;
		this.address = "unknown";
	}
	
	public Person(String lastName, String firstName, int age) {
		this.firstName = firstName;
		this.lastName= lastName;
		this.address = "unknown";
		this.age = age;
	}
	
	public Person(String lastName, String firstName, int age, String address) {
		this.firstName = firstName;
		this.lastName= lastName;
		this.address = address;
		this.age = age;
		
	}

	

	
	
	// 1.9
	public Person(String lastName, String firstName, int age, String address, City birthCity) {
		this.lastName= lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.birthCity = birthCity;
	}

	// 1.8
//	@Override
//	public String toString() {
//		return "Person [lastName=" + lastName +
//				", firstName=" + firstName +
//				", age=" + age +
//				", address="+ address + "]";
//	}
	
	// 1.9 ??????????
//	@Override // ie définie au niveau de la classe mère, et on a modifié son contenu
//	public String toString() {
//		return "Person [lastName=" + lastName +
//				", firstName=" + firstName +
//				", age=" + age +
//				", address="+ address + "]" + "Born" + birthCity ;
//	}
	
	// 2
	@Override // ie définie au niveau de la classe mère, et on a modifié son contenu
	public String toString() {
		return lastName + ", " + firstName + ", " + age +
				", habitant " + address + ", Ville de naissance: " + birthCity ;
	}
}
