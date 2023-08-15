
public class Application {

	
	// Method (omdat er return type staat)
	public static void main(String[] args) {
		// abstract class mag je niet aanmaken
		// Animal animal1 = new Animal();
		// animal1.setLegs(2);
		// animal1.setName("Kangaroo");

		Cat cat1 = new Cat();
		cat1.setLegs(4);
		cat1.setName("Tiger");
		cat1.makeSound();
		cat1.eatsMeat();
		
		Elefant elefant1 = new Elefant();
		elefant1.setLegs(4);
		elefant1.setName("Elefant");
		elefant1.makeSound();
		elefant1.eatsMeat();
		
		Bird bird1 = new Bird();
		bird1.setLegs(2);
		bird1.setName("Mus");
		bird1.makeSound();
		bird1.eatsMeat();
		
	}
	
}
