import java.util.*;
public class TRAINCONSISTMANAGEMENTAPP {
    public static void main (String args[]){
        System.out.println("==========================================");
        System.out.println("   UC4 - Maintain Ordered Bogie Consist  ");
        System.out.println("==========================================");
        List<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Initial Train Consist:"+ trainConsist);
        trainConsist.add(2,"Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:"+ trainConsist);
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing First and Last Bogie:"+trainConsist);
        System.out.println();
        System.out.println("UC4 ordered consist operation completed...");


    }

}
