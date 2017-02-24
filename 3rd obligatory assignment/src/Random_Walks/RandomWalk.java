package Random_Walks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andrasacs
 */
public class RandomWalk {

    int currentX, currentY, max, stepsTaken, edge, maxDistance;

    public RandomWalk(int max, int edge) {
        maxDistance = 0;
        currentX = 0;
        currentY = 0;
        this.max = max;
        this.edge = edge;
        this.stepsTaken = 0;
    }

    public RandomWalk(int max, int edge, int startX, int startY) {
        maxDistance = 0;
        currentX = startX;
        currentY = startY;
        this.max = max;
        this.edge = edge;
    }

    private int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }
    
        public int getMaxDistance() {
            return maxDistance;
        }

    public void takeStep() {
        double direction;
        direction = Math.random() * 4 + 1;
        maxDistance = max(maxDistance, Math.max(Math.abs(currentX), Math.abs(currentY)));
        //System.out.println((int) direction);
        switch ((int) direction) {
            case 1: // right
                this.currentX++;
                break;
            case 2: // left
                this.currentX--;
                break;
            case 3: // up
                this.currentY++;
                break;
            case 4: // down
                this.currentY--;
                break;
        }
        stepsTaken++;
    }

    // returns true if the number of steps taken is less than the maximum number; returns false otherwise
    public boolean moreSteps() {
        if (stepsTaken < max) {
            return true;
        }
        return false;
    }

    // returns true if the current position is on the square (include the boundary as part of the square); returns false otherwise.
    public boolean inBounds() {
        if (currentX < edge && currentY < edge) {
            return true;
        }
        return false;
    }

    // Add to the RandomWalk class a method named walk that has no parameters and returns nothing. 
    // Its job is to simulate a complete random walk.
    // This should be a very simple loop (while or do... while) 
    // --- you will need to call the methods takeStep, moreSteps, and inBounds.
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
            System.out.println(this.toString());
        }
        if (!moreSteps()) {
            System.out.println("Out of steps");
        }
        if (!inBounds()) {
            System.out.println("Out of bounds");
        }
    }

    public int getX() {
        return currentX;
    }

    public int getY() {

        return currentY;
    }

    @Override
    public String toString() {
        return "RandomWalk{" + "currentX=" + currentX + ", currentY=" + currentY + ", max=" + max + ", stepsTaken=" + stepsTaken + ", edge=" + edge + '}';
    }

}
