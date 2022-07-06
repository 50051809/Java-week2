import java.util.Scanner;

public class ex06_Hypotenuse {

    public static void main(String[] args) {

        double side1 = 0, side2 = 0, hypotenuse;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of side 1 of triangle: ");
        side1 = input.nextDouble();
        System.out.println("Enter length of side 2 of triangle: ");
        side2 = input.nextDouble();

        hypotenuse = Math.sqrt((side1*side1)+(side2*side2));
        System.out.println("Length of hypotenuse: " + hypotenuse);

        input.close();

        
    }//main
    
}//class
