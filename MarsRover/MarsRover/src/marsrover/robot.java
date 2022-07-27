/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import java.util.ArrayList;

/**
 *
 * @author Ahmed Nobi
 */
public class robot {
    private int sizeOfPlanetX, sizeOfPlanetY, startX, startY;
    private char startDirection;
    private String sequenceOfMoves;

    public robot(int sizeOfPlanetX, int sizeOfPlanetY, int startX, int startY, char startDirection, String sequenceOfMoves) {
        this.sizeOfPlanetX = sizeOfPlanetX;
        this.sizeOfPlanetY = sizeOfPlanetY;
        this.startX = startX;
        this.startY = startY;
        this.startDirection = startDirection;
        this.sequenceOfMoves = sequenceOfMoves;
    }

    public void solve(){
        for(int i = 0; i < this.sequenceOfMoves.length(); i++){
            if (this.sequenceOfMoves.charAt(i) == 'F' || this.sequenceOfMoves.charAt(i) == 'B')
                makeMove(this.sequenceOfMoves.charAt(i));
            else 
                changeDirection(this.sequenceOfMoves.charAt(i));
        }
        System.out.print(this.startX + " " + this.startY + " " + this.startDirection + "\n");
    }
    
    private void changeDirection(char rotate){
        if(rotate == 'L'){
            if(this.startDirection == 'N')
                this.startDirection = 'W';
            else if(this.startDirection == 'E')
                this.startDirection = 'N';
            else if(this.startDirection == 'S')
                this.startDirection = 'E';
            else if(this.startDirection == 'W')
                this.startDirection = 'S';
        }
        else if (rotate == 'R'){
            if(this.startDirection == 'N')
                this.startDirection = 'E';
            else if(this.startDirection == 'E')
                this.startDirection = 'S';
            else if(this.startDirection == 'S')
                this.startDirection = 'W';
            else if(this.startDirection == 'W')
                this.startDirection = 'N';
        }        
    }
    
    private void makeMove(char moveDirection){
        if (moveDirection == 'B'){
            if(this.startDirection == 'N')
                this.startY--;
            if(this.startDirection == 'E')
                this.startX++;
            if(this.startDirection == 'S')
                this.startY++;
            if(this.startDirection == 'W')
                this.startX--;
        }
        else if (moveDirection == 'F'){
            if(this.startDirection == 'N')
                this.startY++;
            if(this.startDirection == 'E')
                this.startX--;
            if(this.startDirection == 'S')
                this.startY--;
            if(this.startDirection == 'W')
                this.startX++;
        }
        this.startX = (this.startX % this.sizeOfPlanetX + this.sizeOfPlanetX) % this.sizeOfPlanetX;
        this.startY = (this.startY % this.sizeOfPlanetY + this.sizeOfPlanetY) % this.sizeOfPlanetY;
    }
    
    
}
