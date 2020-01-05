public class Wolf {
	
	private String gender;
	private String name;
	private int weight;
	private int age;
	private String color;

	public String getGender(){
		return gender;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getWeight(){
		return weight;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Uncorrect age");
		} else {
		this.age = age;	
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Hello, my name is " + name + ". I'm going.");
	}

	public void run() {
		System.out.println("Hello, my name is " + name + ". I'm running.");
	}

	public void howl() {
		System.out.println("Hello, my name is " + name + ". I'm howling");
	}

	public void hunt() {
		System.out.println("Hello, my name is " + name + ". I'm hunting.");
	}
}