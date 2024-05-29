package Ch2;

import java.util.Scanner;

/*
Convert feet into meters
 */
public class Ch2_3 {
    public static void main(String[] args) {
        //import the scanner
        Scanner input = new Scanner(System.in);
        //prompt the user to input a number value
        System.out.print("Enter a value for feet: ");
        //compute feet
        double feet = input.nextDouble();
        //compute meter
        double meters = feet * 0.305;
        //display results
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
