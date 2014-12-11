package java.com.condingame.ragnarokPowerofthor;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position

        Queue<String> directions = new LinkedList<String>();
        while(LX!=TX || LY!=TY) {
        	if(TX > LX && TY > LY) 
        	{
        		TX--;
        		TY--;
        		directions.add("NW");
        	}
        	else if(TX > LX && TY < LY){
        		TX--;
        		TY++;
        		directions.add("SW");//NE
        	}
        	else if(TX > LX && TY==LY) {
        		TX--;
        		directions.add("W");
        	}
        	else if(TX < LX && TY < LY ){
        		TX++;
        		TY++;
        		directions.add("SE");
        	}
        	else if(TX < LX && TY > LY ){
        		TX++;
        		TY--;
        		directions.add("NE");
        	}
        	else if(TX < LX && TY==LY) {
        		TX++;
        		directions.add("E");
        	}
        	else if(TX==LX && TY > LY) {
        		TY--;
        		directions.add("N");
        	}
        	else if(TX==LX && TY < LY) {
        		TY++;
        		directions.add("S");
        	}
        }
        
        // game loop
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.out.println(directions.poll());
            //System.out.println("E"); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}
