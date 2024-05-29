package Ch2;

import java.util.Scanner;

/*
Sum of digits in an integer
 */
public class Ch2_6 {
    public static void main(String[] args) {
    //scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");
        int number= input.nextInt();
        //compute the first digit
        int firstDigit = number % 10;
        //take out the first digit
        int remainingNumber = number / 10;
        //compute the second digit
        int secondDigit = remainingNumber % 10;
        //take out the second digit
        remainingNumber = remainingNumber / 10;
        //compute the third digit
        int thirdDigit = remainingNumber % 10;
        //sum the number all together
        int sum = firstDigit + secondDigit + thirdDigit;
        //display results
        System.out.println("The sum is: " + sum);
    }
}
