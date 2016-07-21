package oop;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dog dog = new Dog("Bush", 5);
		dog.move();
		dog.talk();
		dog.isSecuringHouse();

		Duck duck = new Duck("American chicken", 4);
		duck.move();
		duck.talk();
		duck.produceEgg();

	}

}
