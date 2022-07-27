/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import java.util.Scanner;

/**
 *
 * @author Ahmed Nobi
 */
public class MarsRover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sizeOfPlanetX, sizeOfPlanetY, startX, startY;
        char startDirection;
        String sequenceOfMoves;
        
        sizeOfPlanetX = input.nextInt();        
        sizeOfPlanetY = input.nextInt();
        
        startX = input.nextInt();
        startY = input.nextInt();
        startDirection = input.next().charAt(0);
        
        sequenceOfMoves = input.next();
        
        robot marsRover = new robot(sizeOfPlanetX, sizeOfPlanetY, startX, startY, startDirection, sequenceOfMoves);
        
        marsRover.solve();
        
    }
    
}
