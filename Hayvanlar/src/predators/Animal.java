package predators;

public class Animal implements Predator {
  String name;

public String getName() {
	return name;
}

public String setName(String name) {
	return this.name = name;
}

@Override
public String swim() {
	return name;
	
	
}

@Override
public String fly() {
	return name;
	// TODO Auto-generated method stub
	
}

@Override
public String walk() {
	return name;
	// TODO Auto-generated method stub
	
}

@Override
public String hunt() {
	return name;
	// TODO Auto-generated method stub
	
}


  
}
