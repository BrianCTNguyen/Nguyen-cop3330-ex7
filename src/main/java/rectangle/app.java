package rectangle;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brian Nguyen
 */

/*
When working in a global environment, you’ll have to present information in both metric and Imperial units.
And you’ll need to know when to do the conversion to ensure the most accurate results.

Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.

Example Output
What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters

The formula for this conversion is m2 = f2 × 0.09290304

Constraints
Keep the calculations separate from the output.
Use a constant to hold the conversion factor.

Challenges
Revise the program to ensure that inputs are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
Create a new version of the program that allows you to choose feet or meters for your inputs.
Implement this program as a GUI program that automatically updates the values when any value changes.
 */

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        double length = in.nextDouble();

        System.out.print("What is the width of the room in feet? ");
        double width = in.nextDouble();

        System.out.println("You entered dimensions of " + length + " by " + width + " feet");

        double area = length*width;
        double conversionFactor = area*0.09290304;


        System.out.println("The area is");
        System.out.println(area+ " square feet");
        System.out.println(conversionFactor+ " square meters");

    }
}
