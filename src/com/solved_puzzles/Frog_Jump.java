package com.solved_puzzles;

public class Frog_Jump {

	public static void main(String[] args) {

		int[] stones = { 0, 1, 3, 5, 6, 8, 12, 17 };
		System.out.println(canCross(stones));
	}
	
	// Not working
	
	public static boolean canCross(int[] stones) {

		boolean flag = true;

		int k = 0;
		int newStones[] = new int[stones.length];

		for (int i = 0; i <= stones.length - 1; i++) {

			if (i == 0)
				newStones[i] = stones[i];
			else
				newStones[i] = stones[i] - stones[i - 1];

		}

		int[] test = { 0, 1, 2, 2, 1, 2, 4, 5 };

		for (int i = 0; i <= stones.length - 2; i++) {

			child: for (int j = i + 1; j <= stones.length - 1; j++) {
				System.out.println(test[j] - test[i]);
				if ((test[j] - test[i] < k)) {
					continue;
				} else if ((test[j] - test[i] == (k + 1)) || (test[j] - test[i] == k)) {
					k = (test[j] - test[i]);
					break child;
				}
			}
		}

		return flag;
	}

}
