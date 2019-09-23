package encapsulation.referencevariablecasting;

class Animal{
	public void pet() {
		System.out.println("Animal");
	}
}

class Horse extends Animal{
	
	public void pet() {
		System.out.println("Horse");
	}

	public void eat() {
		System.out.println("Grass");
	}
}

public class InvokeSubclassMethodUsingSupeclassReference {

	public static void main(String[] args) {
		
		Animal[] animal = {new Animal(), new Horse(), new Animal()};
		
		for(Animal animal2: animal){
			animal2.pet();
			
			if(animal2 instanceof Horse) {
				//animal2.eat();
				
				Horse horse = ((Horse) animal2);				
				horse.eat();
			}
		}
	}
	
}
