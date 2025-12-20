abstract class Animalss{
	abstract void makesound();
	void sleep() {
		System.out.println("animal makes the sound");
	}
	
	Animalss(){
		System.out.println("Animal constructor has been called");
	}
}
class Dogs extends Animalss{
	void makesound() {
		System.out.println("Dog is barking");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.sleep();
		d.makesound();
	}
}
