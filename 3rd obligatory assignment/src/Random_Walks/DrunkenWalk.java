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
public class DrunkenWalk {
    
    private int counter;
    
    public DrunkenWalk (int drunks, int steps, int bounds) {
     
        for (int i = 0; i < drunks; i++){
            
    RandomWalk drunk = new RandomWalk (steps, bounds);
    drunk.walk();
    
    System.out.println (drunk.toString());
    
    if (drunk.inBounds()== false) {
        counter++;
        System.out.println ("a drunk fell in the water!");
    }
}   
    }
    @Override
    public String toString(){
    return "stop! your drunks fell into the water: " + counter + " times";
}
    
    
    
    
    
    
    
    
}
