import javax.swing.JOptionPane;

public class HappyPet {
	static int pet;
	static int task;
	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		pet = JOptionPane.showOptionDialog(null, "Which do you want to buy?", "", JOptionPane.INFORMATION_MESSAGE,  0, null,
				new String[] { "bunny", "dog", "cat" }, null);
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for (int i = 0; i < 9; i++) {
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "Which do you want to do with your pet?", "happiness", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "cuddle", "water", "food" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	cuddle();
}
else if(task == 1) {
	water();
}
else if(task == 2) {
	food();
}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
if(happinessLevel >= 24) {
	JOptionPane.showMessageDialog(null, "you most love your pet!");
	break;
}
}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public static void cuddle() {
		if (pet == 0 || pet == 1 || pet == 2) {
			happinessLevel += 4;
		}
	}

	public static void water() {
		if (pet == 0 || pet == 1 || pet == 2) {
			happinessLevel += 4;
		}
	}

	public static void food() {
		if (pet == 0 || pet == 1 || pet == 2) {
			happinessLevel += 4;
		}
	}
}
