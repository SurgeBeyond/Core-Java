package encapsulation.polymorphism;

class Leaf {
	public void leaf() {
		System.out.println("Leaf");
	}
}

class Tree extends Leaf {
	public void tree() {
		System.out.println("Tree");
	}
}

class Jungle extends Tree {
	public void tree() {
		System.out.println("Tree");
	}
}



//A reference variable can be declared as a class type.
public class ClassReferenceToSubTypes {

	public static void main(String[] args) {
		Leaf leaf1 = new Leaf();
		Leaf leaf2 = new Tree();
		Leaf leaf3 = new Jungle();
		
		leaf1.leaf();
		leaf2.leaf();
		leaf3.leaf();
	}

}
