package Ch2;

import java.util.Scanner;
/*
Calculate tips
 */
public class Ch2_5 {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //prompt to enter the subtotal and rate
        System.out.println("Enter the subtotal and a gratuity rate: ");
        //compute subtotal and rate
        double subtotal = sc.nextDouble();
        double rate = sc.nextDouble() / 100.0;

        double gratuity = subtotal * rate;
        double total = subtotal + gratuity;
        //display results
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total + ".");
    }
}
