package Ch2;

import java.util.Scanner;
/*
Convert Celsius to Fahrenheit in a double value
 */
public class Ch2_1 {
    public static void main(String[] args) {
    //Scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a degree in Celsius
        System.out.print("Enter an degree in Celsius: ");
        //compute Celsius
        double celsius = input.nextDouble();
        //input the convert formula
        double fahrenheit = (celsius * 9.0/5.0) + 32;

        System.out.println("Celsius in Fahrenheit: " + fahrenheit);
    }
}
