import java.util.*;

public class CyclePhase{

    Scanner scn = new Scanner(System.in);

    void showPhase(){
        System.out.println("Enter how many days since your last period started: ");
        int dayPassed = scn.nextInt();

        if (dayPassed <= 5) {
            System.out.println("Menstrual Phase: Rest, hydrate, and eat well.");
            System.out.println("Foods: Iron-rich foods like spinach, lentils, and dark chocolate.");
            System.out.println("Self-Care: Warm baths, herbal teas, and journaling.");
        } else if (dayPassed <= 14) {
            System.out.println("Follicular Phase: Energy rising and creativity flowing!");
            System.out.println("Foods: Fresh fruits, salads, lean proteins, and fermented foods.");
            System.out.println("Self-Care: Exercise, new ideas, and socializing.");
        } else if (dayPassed <= 17) {
            System.out.println("Ovulation Phase: You’re glowing and confident!");
            System.out.println("Foods: High-protein meals, eggs, avocados, and veggies.");
            System.out.println("Self-Care: Dress up, go out, and celebrate yourself.");
        } else if (dayPassed <= 28) {
            System.out.println("Luteal Phase: Slow down and listen to your body.");
            System.out.println("Foods: Magnesium-rich foods (nuts, bananas), soups, and dark chocolate.");
            System.out.println("Self-Care: Gentle movement, rest, and nutrient-rich food.");
        } else {
            System.out.println("You may have entered a new cycle — time to track again!");
        }
    }
}
