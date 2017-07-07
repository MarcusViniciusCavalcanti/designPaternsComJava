package nullObjectImplemetation;

public class Pessoa {
	private String name;
	private int age;
	private Curse curse;
	
	public Pessoa(String name, int age, Curse curse) {
		this.name = name;
		this.curse = curse;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Curse getCurse() {
		return curse;
	}

	public int getAge() {
		return this.age;
	}
}
