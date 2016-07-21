package oop;

public class Dog implements Behaviour {
	private String name;
	private int weight;

	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {

		if (weight > 0) {
			this.weight = weight;
		} else
			throw new IllegalArgumentException();
	}

	@Override
	public void talk() {
		for (int i = 0; i < weight; i++) {
			System.out.println("Go");
		}
	}

	@Override
	public void move() {
		System.out.println("moving by 4 legs");

	}

	public void isSecuringHouse() {
		System.out.println("a dog is securing a house");
	}

}
