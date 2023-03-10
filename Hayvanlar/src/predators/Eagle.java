package predators;

public class Eagle extends Animal {

	public Eagle(String string) {
		
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
	public String fly() {
		System.out.println("Cok yuksekten ucar.");
		return super.fly();
	}

	@Override
	public String walk() {
		System.out.println("Karada yavas yurur.");
		return super.walk();
	}

	@Override
	public String hunt() {
		System.out.println("Karada ve havada avlanir.");
		return super.hunt();
	}

}
