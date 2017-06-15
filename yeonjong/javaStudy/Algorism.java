package javaStudy;

public class Algorism {

	public static void main(String[] args) {
		
		int box = 7;
		int[][] arr = new int[box][box];
		
		int x = 0;
		int y = 0;
	
		for(int i = 1; i <= (box * box); i++) {
			
			arr[x][y] = i;
			System.out.println("(" + x + "." + y + ") = " + i);
			
			if(x >= y) {
				if(x % 2 == 0) {
					if(x == y && x != 0) {
						System.out.println("1");
						x--;
					} else {
						System.out.println("2");
						y++;
					}
				} else { // x < y
					if(y == 0) {
						System.out.println("3");
						x++;
					} else {
						System.out.println("4");
						y--;
					}
				}
			} else { //x < y
				if(y % 2 == 0) {
					if(x == 0) {
						System.out.println("5");
						y++;
					} else {
						System.out.println("6");
						x--;
					}
				} else {
					System.out.println("7");
					x++;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println();
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		}
	}
}
