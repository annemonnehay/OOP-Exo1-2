
public class City {
	// attributs
	// 1.1
//	public String name;
//	public String country;
//	public int population;

	// 1.2
	public String name;
	public String country;
//	private int population;
	
	// 2.0
	public int population;

	// 1.7
	static int count = 0;

//	 constructor
	public City(String name, String country, int population) {
		// 1.1
		this.name = name;
		this.country = country;
		this.population = population;
		// 1.2
//		setName(name);
//		setCountry(country);
//		setPopulation(population);
		// 1.7
		this.count = count;
		count++; // 5 (5 objects instantiated with this constructor)
//		++count; // 5	
	}

	// 1.3
	/*
	 * Ajouter un nouveau constructeur qui accepte 2 paramètres le nom de la ville
	 * et le nombre d’habitants puis tester le en affichant les 3 attributs.
	 */

	public City(String name, int population) {
		this.name = name;
		this.population = population;
		this.country = "unknown";
	}

	

	// 1.1
	// methods
	public void display() {
		System.out.println("City: " + name + "\t | Country: " + country + "\t | Population: " + population);
	}

	// 1.2 Setters and getters
	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public String setCountry(String country) {
		return this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public int setPopulation(int population) {
		if (population < 0)
			System.out.println("Population can't be negative");
		return this.population = population;
	}
//	public int setPopulation(int population) {
//		if (population < this.population)
//			System.out.println("Population can't be decremented");
//		return this.population = population;
//	}

	// 1.2
	public void decreasePopulation(int nbPeople) {
		population -= nbPeople;
	}

	// 1.4
	public void display2() {
		System.out.println("ville de " + name + " en " + country + " ayant " + population);
	}

	// 1.6
//	public String toString() {
//		return "ville de " + name + " en " + country +
//				" ayant " + population;
//	}

	// 1.7
	public int getCount() {
		return count;
	}

	// 1.9 
//	@Override // = we are redifining the default toString method 
//	public String toString() {
//		return "City [name= " + name + ", state= " + country + ", population= " + population + "]";
//	}
	
	// 2
	@Override // = we are redifining the default toString method 
	public String toString() {
		return name + ", " + country + ", " + population;
	}
}
