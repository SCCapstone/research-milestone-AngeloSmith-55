import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Workout{
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p = new PrintWriter(new File("Workout.csv"));
        StringBuilder s = new StringBuilder();
        s.append("Workout Type");
        s.append(',');
        s.append("Period");
        s.append('\n');
        
        String WorkoutType;
        int exit;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter type of Workout: ");
            WorkoutType = sc.next();
            System.out.println("Please enter time of day: ");
            String Period = sc.next();
            s.append(WorkoutType);
            s.append(',');
            s.append(Period);
            s.append('\n');
            p.write(s.toString());
            System.out.println("Please enter 0 to exit or 1 to continue : ");
            exit = sc.nextInt();

        }
        while(exit != 0);
        p.close();
        System.out.println("done!");
        
    } 
}