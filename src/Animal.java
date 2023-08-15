
public abstract class Animal {

	protected String name;
	
	protected int legs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Diernaam is " + name);
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
		System.out.println("Aantal poten is " + legs);
	}
	
	
	public abstract void makeSound();
	public abstract void eatsMeat();

}
