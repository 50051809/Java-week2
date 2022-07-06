import java.util.Scanner;

public class ex02_CountToNumber {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to count to: ");
            
            int max = scanner.nextInt();

            System.out.println("Now Counting. . . ");
    
            for (int i = 0; i <=max; i++){
                
                System.out.println(i);
            }//for

            scanner.close();
            
        }//main
        
    }//class
    
