package testproject;

import java.util.Random;

public class Test {
	private static final int MAX=100;
	int[][][] a=new int[MAX][MAX][MAX];
	public Test() {
		Random r=new Random();
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				for (int k = 0; k < MAX; k++) {
					a[i][j][k]=r.nextInt(20);
				}
		    }
		}
	}
	
	public void printArray(int r, String s) {
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				for (int k = 0; k < MAX; k++) {
					System.out.println(a[i][j][k]);
				}
			}
		}
	}
}
