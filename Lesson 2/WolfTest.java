public class WolfTest {
	public static void main(String[] args) {
		
		Wolf wolfOne = new Wolf();
		
		wolfOne.gender = "male";
		wolfOne.name = "Killer";
		wolfOne.weight = 15;
		wolfOne.age = 5;
		wolfOne.color = "gray";

		System.out.println("Gender: " + wolfOne.gender);
		System.out.println("Name: " + wolfOne.name);
		System.out.println("Weight: " + wolfOne.weight);
		System.out.println("Age: " + wolfOne.age);
		System.out.println("Color: " + wolfOne.color);

		wolfOne.go();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}