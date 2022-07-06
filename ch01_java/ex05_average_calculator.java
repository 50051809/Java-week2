import java.util.ArrayList;
import java.util.Scanner;

public class ex05_average_calculator {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayList<Double> numList = new ArrayList<Double>();

        System.out.println("Enter a number or press = ");
        input = sc.next();

        while (!input.equals(anObject:"=")){
            Double nextNum = Double.parseDouble(input);
            numList.add(nextNum);
            System.out.println("Enter a number or press = ");
            input = sc.next();

        }//while

        double average = 0;
        double sum = 0;

        for (double i : numList){
            sum += i;

        }//for

        average = sum / numList:size();

        System.out.printf("Your average is %.2f%n ", average);

        sc.close();
        
    }//main
}//class
