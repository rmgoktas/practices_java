package predators;

public class Lion extends Animal {

	public Lion(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String setName(String name) {
		return super.setName(name);
	}

	@Override
	public String walk() {
		System.out.println("Karada hizli yurur.");
		return super.walk();
	}

	@Override
	public String hunt() {
		System.out.println("Yalnizca karada avlanir.");
		return super.hunt();
	}

}
