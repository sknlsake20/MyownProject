package task4;

public class Cat extends Animal implements Pet{
	private String name;
	public Cat(String n) {
		super(4);
		System.out.println(n+" cat have 4 legs..");
		name=n;
	}
	public Cat() {
		this("");
	}
	@Override
	public String getName() {
		
		return name;
	}
	@Override
	public void setName(String n) {
		name=n;
		
	}
	@Override
	public void play() {
		System.out.println("The "+name+" played..");
		
	}
	@Override
	public void eat() {
		System.out.println("Cats eat mice and fruits..");
	}
	
	
}
