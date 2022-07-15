package zoo;

import org.animals.*;

public class VandalurZoo {
	public static void printCharacteristics(String animal, int age, String color, float weight, boolean isVegetarian, boolean canClimb, String sound) {
		System.out.println();
		System.out.println("Animal: " + animal);
		System.out.println("Age: " + age);
		System.out.println("Color: " + color);
		System.out.println("Weight: " + weight);
		System.out.println("Is vegetarian: " + isVegetarian);
		System.out.println("Can climb: " + canClimb);
		System.out.println("Sound: " + sound);
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Animals in the zoo: Deers, Elephants, Giraffes, Lions, Monkeys and Tigers");

		Deer deer = new Deer();
		deer.setAge(5);
		deer.setColor("Dark Brown");
		deer.setWeight(55);
		printCharacteristics("Deer", deer.getAge(), deer.getColor(), deer.getWeight(), deer.isVegetarian(), deer.canClimb(), deer.sound());
		
		
		Elephant elephant = new Elephant();
		elephant.setAge(50);
		elephant.setColor("Greyish Brown");
		elephant.setWeight(4000);
		printCharacteristics("Elephant", elephant.getAge(), elephant.getColor(), elephant.getWeight(), elephant.isVegetarian(), elephant.canClimb(), elephant.sound());
		
		Giraffe giraffe = new Giraffe();
		giraffe.setAge(10);
		giraffe.setColor("Brown with dark patches");
		giraffe.setWeight(1500);
		printCharacteristics("Giraffe", giraffe.getAge(), giraffe.getColor(), giraffe.getWeight(), giraffe.isVegetarian(), giraffe.canClimb(), giraffe.sound());
		
		
		Lion lion = new Lion();
		lion.setAge(8);
		lion.setColor("Reddish Brown");
		lion.setWeight(180);
		printCharacteristics("Lion", lion.getAge(), lion.getColor(), lion.getWeight(), lion.isVegetarian(), lion.canClimb(), lion.sound());
		
		
		Monkey monkey = new Monkey();
		monkey.setAge(10);
		monkey.setColor("Brown");
		monkey.setWeight(7);
		printCharacteristics("Monkey", monkey.getAge(), monkey.getColor(), monkey.getWeight(), monkey.isVegetarian(), monkey.canClimb(), monkey.sound());

		
		Tiger tiger = new Tiger();
		tiger.setAge(8);
		tiger.setColor("Orange with black strips");
		tiger.setWeight(100);
		printCharacteristics("Tiger", tiger.getAge(), tiger.getColor(), tiger.getWeight(), tiger.isVegetarian(), tiger.canClimb(), tiger.sound());
	}
}
