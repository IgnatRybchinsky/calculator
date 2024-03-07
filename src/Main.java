
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number 1: ");
        Scanner s = new Scanner(System.in);
        Float number1Ryb = s.nextFloat();


        System.out.println("Enter the number 2: ");
        Scanner sc = new Scanner(System.in);
        Float number2Ryb = sc.nextFloat();
        float sum =(number1Ryb+number2Ryb);
        System.out.println("Sum is: " +sum);
        float difference = (number1Ryb-number2Ryb);

        System.out.println("Difference: " + difference);
        float product = (number1Ryb*number1Ryb);
        System.out.println("Product: " + product);
        float quotient= (number1Ryb/number2Ryb);
        System.out.println("Quotient: "+ quotient);





    }
}