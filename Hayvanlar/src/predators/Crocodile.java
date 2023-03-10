package predators;

public class Crocodile extends Animal {

	public Crocodile(String string) {
		System.out.println("Nil Timsahi");
        
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String setName(String name) {
		return super.setName(name);
	}

	@Override
	public String swim() {
		System.out.println("Suda hizli yuzer.");
		return super.swim();
	}

	@Override
	public String walk() {
		System.out.println("Karada yavas yurur.");
		return super.walk();
	}

	@Override
	public String hunt() {
		System.out.println("Karada ve suda avlanir.");
		return super.hunt();
	}

	

}
