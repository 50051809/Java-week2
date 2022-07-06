import java.util.Scanner;

public class ex03_multiplesOfThree {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to count to: ");
            
            int max = scanner.nextInt();

            System.out.println("Now Counting. . . ");
    
            for (int i = 1; i <=max; i++){
                if(i % 3 == 0)
                
                System.out.println(i);
            }//for

            scanner.close();
                
            
        }//main
        
    }//class