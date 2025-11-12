import java.util.*;
import java.time.*;

public class PeriodTracker{

    Scanner scn = new Scanner(System.in);

    LocalDate lastPeriod;
    int cycleLength = 28;

    void track(){
        System.out.print("Enter your last period date (YYYY-MM-DD):" );
        lastPeriod = LocalDate.parse(scn.next());

        System.out.print("Cycle day length: ");
        cycleLength = scn.nextInt();

        System.out.println("Details saved!!!");
    }

    void cycleSummary(){
        if (lastPeriod == null){
            return;
        }

        LocalDate nextPeriod = lastPeriod.plusDays(cycleLength);

        System.out.println("Last period: " + lastPeriod);
        System.out.println("Cycle length: " + cycleLength + " days");
        System.out.println("Next period: " + nextPeriod);

    }
}

