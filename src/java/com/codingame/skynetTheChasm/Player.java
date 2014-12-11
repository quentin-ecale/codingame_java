package java.com.codingame.skynetTheChasm;

import java.util.*;
import java.io.*;
import java.math.*;

public class Player {

	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt(); // the length of the road before the gap.
        int G = in.nextInt(); // the length of the gap.
        int L = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int S = in.nextInt(); // the motorbike's speed.
            int X = in.nextInt(); // the position on the road of the motorbike.

            //if motorbike is just before gap
            if(X==R-1){
                System.out.println("JUMP");
            }
            //if motorbike is after gap and speed superior to the gap length
            else if(X > R || S > G + 1) {
                System.out.println("SLOW");
            }
            //if motorbike speed is inferior to gap length and we haven't already passed the gap
            else if(S < G + 1){
                System.out.println("SPEED");
            }
            else {
                System.out.println("WAIT");
            }
        }
    }

}
