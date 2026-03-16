import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lab Group Generator
 * A simple tool for teachers to randomize a class list 
 * and generate balanced lab groups.
 */
public class LabGroupGenerator {

    public static void main(String[] args) {
        // 1. Create a list of student names
        List<String> roster = new ArrayList<>();
        roster.add("Alice");
        roster.add("Bob");
        roster.add("Charlie");
        roster.add("Diana");
        roster.add("Ethan");
        roster.add("Fiona");
        roster.add("George");
        roster.add("Hannah");

        int groupSize = 3; // Desired number of students per group

        // 2. Shuffle the roster to ensure random groups
        Collections.shuffle(roster);

        System.out.println("--- Random Lab Groups ---");
        
        // 3. Loop through the list and print out the groups
        int groupNumber = 1;
        for (int i = 0; i < roster.size(); i += groupSize) {
            System.out.println("\nGroup " + groupNumber + ":");
            
            // Create a sublist for each group, ensuring we don't go out of bounds
            int endOfGroup = Math.min(i + groupSize, roster.size());
            List<String> group = roster.subList(i, endOfGroup);
            
            // Print the members of the current group
            for (String student : group) {
                System.out.println("- " + student);
            }
            groupNumber++;
        }
    }
}
