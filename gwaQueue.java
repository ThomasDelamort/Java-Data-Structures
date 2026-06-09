import java.util.*;
import java.util.Scanner;

public class gwaQueue {
    
    static Scanner sc = new Scanner(System.in);
    static double gwa;
    static double sum;

    public static void main(String[] args) {
        Queue<Double> queue = new LinkedList<>();
        

        System.out.print("Enter amount of subjects: ");
        int gSize = sc.nextInt(); sc.nextLine();
        
        for (int i = 0; i < gSize; i++) {
            System.out.print("Enter Grade: ");
            double grade = sc.nextDouble(); queue.offer(grade);
        }

        int grades = queue.size();

        while (!queue.isEmpty()) {
            double number = queue.poll();
            sum += number;
        }

        gwa = sum /= grades;

        System.out.printf("Your gwa is %.2f", gwa);
    }
}
