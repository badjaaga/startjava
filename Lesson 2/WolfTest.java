public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setGender("male");
		wolfOne.setName("Killer");
		wolfOne.setWeight(15);
		wolfOne.setAge(15);
		wolfOne.setColor("gray");

		System.out.println("Gender: " + wolfOne.getGender());
		System.out.println("Name: " + wolfOne.getName());
		System.out.println("Weight: " + wolfOne.getWeight());
		System.out.println("Age: " + wolfOne.getAge());
		System.out.println("Color: " + wolfOne.getColor());
	}
}