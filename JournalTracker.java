import java.util.*;
import java.time.*;

public class JournalTracker{

    Scanner scn = new Scanner(System.in);

    ArrayList<String> journals = new ArrayList<String>();
    ArrayList<LocalDate> dates = new ArrayList<LocalDate>();

    void journalEntry(){
        System.out.println("Write your journal entry (Type 'END' to stop writing): ");
        StringBuilder entryBuilder = new StringBuilder();

        while (true){
            String line = scn.nextLine();

            if (line.equals("END")){
                break;
            }

            entryBuilder.append(line).append("\n");
        }

        String entry = entryBuilder.toString();
        journals.add(entry);
        dates.add(LocalDate.now());

        System.out.println("Journal saved!");
    }

    void viewJournal(){
        if (journals.isEmpty()){
            System.out.println("Your journal entry is empty");
        }

        System.out.println("Journal history..");
        for (int i = 0; i < journals.size(); i++){
            System.out.println(dates.get(i)+ " -> "+ journals.get(i));
        }
    }
}
