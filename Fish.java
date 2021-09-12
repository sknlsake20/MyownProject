package task4;

public class Fish extends Animal{
	
	public Fish() {
		super(0);
		System.out.println("Fish dont have legs..");
	}

	@Override
	public void eat() {
		
	}

	@Override
	public void walk() {
		System.out.println("Fish cant walk..");
	}
	
	
}
