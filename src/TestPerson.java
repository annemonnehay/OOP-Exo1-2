
public class TestPerson {


	public static void main(String[] args) {
		
		// 1.8
//		System.out.println("Exo 1.8");
//		
//		Person manu = new Person("Macron", "Manu", 43, "Elysée");
//		System.out.println(manu);
//		Person vlad = new Person("Poutine", "Vlad", 68);
//		Person joe = new Person("Biden", "Joe");
		
		// 1.9
//		System.out.println("1.9");
//	
//		Person manu1= new Person("Macron", "Manu", 43, "Elysée", new City("Amiens", "France", 0));
//		Person vlad = new Person("Poutine", "Vlad", 68);
//		Person joe = new Person("Biden", "Joe");
//		
//		System.out.println(manu1); // Person [lastName=Macron, firstName=Manu, age=43, address=Elysée]
//		System.out.println(vlad);
//		System.out.println(joe);
		
		// 2
		System.out.println("Exo 2");
		System.out.println("Liste des personalités");
		Person macron = new Person("Macron", "Emmanuel", 43, "L'Elysée à Paris", new City("Amiens", "France",0));
		Person sarko = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		Person boris = new Person("Johnson", "Boris", 56, "Downing Street à Londres", new City("New York", "Etats-Unis", 0));
		Person depardieu = new Person("Depardieu", "Gérard", 72, "Moscou", new City("Châteauroux", "France", 0));
		Person lenny = new Person("Kravitz", "Lenny", 56, "Hotel Particulier à Paris", new City("New York", "Etats-Unis", 0));
		Person lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA", new City("Indian Hills", "Etats-Unis", 0));

		System.out.println(macron);
		System.out.println(sarko);
		System.out.println(boris);
		System.out.println(depardieu);
		System.out.println(lenny);
		System.out.println(lawrence);
	}
}
