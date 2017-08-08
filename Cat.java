
public class Cat {
	private String name;
	private String color;
	private String breed;
	private int age;
	
	public Cat (String name, String color, String breed, int age) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
	}
	public void miaow () {
		System.out.println("Мяу");
	}
	@Override
	public String toString() {
		return "Cat [name = " + name + ", color = " + color + ", breed = " + breed + ", age = " + age + "]";
	}
	
}
