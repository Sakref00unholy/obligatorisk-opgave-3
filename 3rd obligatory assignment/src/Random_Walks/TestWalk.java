package Random_Walks;

// ************************************************************
//  TestWalk.java
//
//  Program to test methods in the RandomWalk class.
// ************************************************************
import java.util.Scanner;

public class TestWalk {

    public static void main(String[] args) {
        int maxSteps;
        int maxCoord;
        int x, y;

        
            Scanner scan = new Scanner(System.in);

            // maximum number of steps in a walk
            // the maximum x and y coordinate
            // starting x and y coordinates for a walk
            System.out.print("Enter the boundary for the square: ");
            maxCoord = scan.nextInt();
            System.out.print("Enter the maximum number of steps: ");
            maxSteps = scan.nextInt();
            System.out.print("Enter the starting x and y coordinates with "
                    + "a space between: ");
            x = scan.nextInt();
            y = scan.nextInt();

            RandomWalk walk1 = new RandomWalk(5, 10);
            RandomWalk walk2 = new RandomWalk(maxCoord, maxSteps, x, y);

            System.out.println(walk1);
            System.out.println(walk2);

            for (int i = 0; i < 5; i++) {
                walk1.takeStep();
                System.out.println(walk1.toString());
                walk2.takeStep();
                System.out.println(walk2.toString());
            }
            System.out.println("the maximum distance for x is: " + walk1.getMaxDistance());
            System.out.println("the maximum distance for y is: " + walk2.getMaxDistance());
        }

     
    }



        //a statement to instantiate a RandomWalk object with a boundary of 10 and 200 as the maximum number of steps.
        // RandomWalk walk3 = new RandomWalk(200, 10);
        // add a statement to have the object walk. Print the object after the walk
        //walk3.walk();
        // System.out.println(walk3); */
//creating 3 different drunkenwalk objects with 20 drunks walking and with different amount of boundaries and maximum steps.
/* DrunkenWalk drunk1 = new DrunkenWalk (20,200,10);
        DrunkenWalk drunk2 = new DrunkenWalk (20,500,10);
        DrunkenWalk drunk3 = new DrunkenWalk (20,200,50);
        
            System.out.println(drunk1);
            System.out.println(drunk2);  
        System.out.println(drunk3); */
 /* Collision bb2 = new Collision();
        System.out.println(bb2); */

