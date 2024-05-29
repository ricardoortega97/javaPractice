package Ch2;

import java.util.Scanner;

/*
convert pounds into kilograms
 */
public class Ch2_4 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a num value
        System.out.print("Enter a number in pounds: ");
        //compute
        double pounds = input.nextDouble();
        //convert into kg
        double kg = pounds * 0.454;
        //display results
        System.out.println(pounds + " pounds is " + kg + " kg");
    }
}
