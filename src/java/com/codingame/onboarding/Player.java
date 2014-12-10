package java.com.codingame.onboarding;

import java.util.*;
import java.io.*;
import java.math.*;

public class Player {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		// game loop
		while (true) {
			System.out.println(getNearestEnemyName(in));
		}
	}

	public static String getNearestEnemyName(Scanner in) {
		String nearestEnemyName = "";
		int dist;
		int distNearestEnemy = 0;
		int count = in.nextInt(); // The number of current enemy ships within
		// range
		for (int i = 0; i < count; i++) {
			String enemy = in.next();
			dist = in.nextInt();
			if (i <= 0) {
				distNearestEnemy = dist;
				nearestEnemyName = enemy;
			} else {
				if (dist < distNearestEnemy) {
					distNearestEnemy = dist;
					nearestEnemyName = enemy;
				}
			}

		}

		return nearestEnemyName;
	}

}
