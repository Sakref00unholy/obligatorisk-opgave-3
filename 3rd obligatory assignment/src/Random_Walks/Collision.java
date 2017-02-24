/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random_Walks;

/**
 *
 * @author phill
 */
public class Collision {

    private int counter;

    public Collision() {

        RandomWalk par1 = new RandomWalk(100000, 2000000, -3, 0);
        RandomWalk par2 = new RandomWalk(100000, 2000000, 3, 0);

        while ((par1.moreSteps() == true) || (par2.moreSteps() == true)) {
            par1.takeStep();
            par2.takeStep();

            if (samePosition(par1, par2)) {
                counter++;

            System.out.println(("particle 1: (" + par1.getX() + "," + par1.getY() + ")"));
            System.out.println(("particle 2: (" + par2.getX() + "," + par2.getY() + ")"));

        }
    }
    }
    public static boolean samePosition(RandomWalk part1, RandomWalk part2) {
        if ((part1.getX() == part2.getX()) && (part1.getY() == part2.getY())) {

            return true;
        } else {
            return false;
        }
    }
}