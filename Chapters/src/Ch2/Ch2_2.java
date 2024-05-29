package Ch2;

import java.util.Scanner;

/*
Compute the volume of a cylinder
 */
public class Ch2_2 {
    public static void main(String[] args) {
        //Scanner to prompt the user to input both the radius and length of a cylinder
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of the cylinder: ");
        //this prompts the user to input to values
        double radius = input.nextDouble();
        double length = input.nextDouble();

        //compute the area
        double area = Math.PI * radius * radius;
        //compute the volume
        double volume = length * area;
        //display the output
        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
