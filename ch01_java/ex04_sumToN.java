import java.util.Scanner;

public class ex04_sumToN {

    public static void main(String[] args) {

        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for N: ");

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++){
            temp += i;

            System.out.println(temp);

        }//for

        scanner.close();
            
    }//main
    
}//class
