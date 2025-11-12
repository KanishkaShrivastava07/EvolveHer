import  java.util.*;

public class EvolveHer{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        PeriodTracker period = new PeriodTracker();
        CyclePhase phase = new CyclePhase();
        JournalTracker journalTracker = new JournalTracker();

        while (true){
            System.out.println("EVOLVEHER........");
            System.out.println("1. Track your Period");
            System.out.println("2. View Cycle Summary");
            System.out.println("3. Check Current Phase");
            System.out.println("4. Write Journal");
            System.out.println("5. View Journal");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = scn.nextInt();
            scn.nextLine();

            switch (choice){
                case 1 -> period.track();
                case 2 -> period.cycleSummary();
                case 3 -> phase.showPhase();
                case 4 -> journalTracker.journalEntry();
                case 5 -> journalTracker.viewJournal();
                case 6 -> {
                    System.out.println("Thank you for using EvolveHer");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
