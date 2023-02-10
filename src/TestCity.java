

/**
 * Exercice 1
 * 
 * @author MonnehayA
 *
 */
public class TestCity {

	public static void main(String[] args) {
		// 1.1
		City toulouse = new City("Toulouse", "France", 450000);
		City barcelone = new City("Barcelone", "Espagne", 1664180);
		City londres = new City("Londres", "Angleterre", 9648000);
		City florence = new City("Florence", "Italie", 711000);
		
//		System.out.println("syso: City: " + toulouse.name + "\t | Country: " + toulouse.country + "\t | Population: " + toulouse.population);
//		toulouse.display();
//		barcelone.display();
//		londres.display();
//		florence.display();

		// 1.2
		City toulouse2 = new City("Toulouse2", "France", 470000);
//		toulouse2.display();
		// l'utilisateur peut changer les attributs d’une ville
//		System.out.println("User can change population: toulouse2.population = -400;");
//		toulouse2.population = -400;
//		toulouse2.display();

		// Setters and getters
		// adding setters and getter and lines 14-16 in constructor

		/*
		 * A priori, l'utilisateur ne peut plus changer les attributs d’une ville sans
		 * votre approbation, dorénavant : toulouse.population = -200 est impossible
		 */
//		System.out.println("User can't change population because attribute CHANGED TO PRIVATE:");
//		toulouse2.population = -200; // 

//		// cependant, l'utilisateur peut changer l’attribut via l’accesseur aussi
//		toulouse.setPopulation(470000);
//		// veiller à trouver une solution ici
		// solution --> add a condition in setPopulation()
	
		City toulouse1 = new City("Toulouse1", "France", 470000); 
//		toulouse1.setPopulation(toulouse.getPopulation() - 100000);
//		toulouse1.setPopulation(-200);
		toulouse1.display();
		// Ajouter cette protection dans votre constructeur --> ????????? deja fait a travers la methode setPopulation?
		// Prenez la peine d’afficher des messages à l’utilisateur qui doit comprendre
		// son erreur
		// Enfin, que faire si l’utilisateur veut réduire la population passant par ex
		// la ville de Toulouse de 470000 à 370000 ?
		// --> create method decreasePopulation
//		toulouse2.decreasePopulation(100000);
//		toulouse2.display();

		/*
		 * 1.3 Ajouter un nouveau constructeur qui accepte 2 paramètres le nom de la ville
		 * et le nombre d’habitants puis tester le en affichant les 3 attributs.
		 */
//		City toulouse5 = new City("Toulouse", 470000);
//		toulouse5.display();

		/*
		 * Ensuite, modifier l’attribut inconnu en passant par les accesseurs, afficher
		 * la ville à nouveau
		 */
//		toulouse5.setCountry("France");
//		toulouse5.display();

		/*
		 * 1.4 crée une méthode pour afficher les attributs d'une ville tel que
		 * toulouse.display(); aura pour résultat : « ville de Toulouse en France ayant
		 * 450000 »
		 */
//		toulouse.display2();

		// 1.5 que se passe t-il ici ? System.out.println(toulouse); Pourquoi ? idk
		System.out.println(toulouse1); // prints City@1eb44e46 - object address in memory
//										// ?
//		System.out.println(barcelone); // prints City@6504e3b2 - object address in memory
										// barcelone ?

		/*
		 * 1.6 Ajouter une méthode toString() qui renvoi une chaîne de caractère
		 * constituée des attributs d’un objet ville, afin d’obtenir le résultat
		 * suivant, par l’appel implicite de la méthode toString de l’objet toulouse :
		 * --> System.out.println(toulouse); : « ville de Toulouse en France ayant
		 * 450000 habitants »
		 */
//		toulouse5.toString(); // inutile de l'appeler cette méthode. Why???
		System.out.println(toulouse1); // "ville de Toulouse en France ayant 450000"
//		System.out.println(barcelone); // "ville de Barcelone en Espagne ayant 1664280"

		/*
		 * 1.7 Trouver un moyen de compter le nombre d'instance de votre classe City,
		 * c’est à dire le nombre d’objets/villes instanciés dans votre programme.
		 * --> Google: "Compter les instances d'une classe c'est le summum de l'inutilité, et en
		 * plus ça impose de manipuler des atomiques pour que ce soit compatible à une
		 * environnement multi-threadé. C'est juste un exercice hyper commun mais qui
		 * montre un exemple de truc à ne pas faire".
		 */
		System.out.println(City.count);

	}
}
