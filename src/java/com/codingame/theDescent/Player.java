package java.com.codingame.theDescent;

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

        // game loop
        while (true) {
            int SX = in.nextInt();
            int SY = in.nextInt();
            
            Integer maxHigh = null;
            Integer mtnPositionWithMaxHigh = null;
            
            for (int i = 0; i < 8; i++) {
                int MH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if(maxHigh == null || maxHigh < MH) {
                	maxHigh = MH;
                	mtnPositionWithMaxHigh = i;
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if(SX == mtnPositionWithMaxHigh) {
            	System.out.println("FIRE");
            }
            else {
            	System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
            }
        }
    }
}
