import java.util.*;
public class TRAINCONSISTMANAGEMENTAPP {
    public static void main (String args[]){
        System.out.println("==========================================");
        System.out.println("   UC5 - Preserve Insertion Order of Bogie  ");
        System.out.println("==========================================");
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");
        System.out.println("Final Train Formation:"+ formation);
        System.out.println();
        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicate automatically.");
        System.out.println();
        System.out.println("UC5 formation setup completed");



    }

}
