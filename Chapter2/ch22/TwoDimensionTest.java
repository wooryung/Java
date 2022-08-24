package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3}, {1,2,3,4}};
		
		int i, j;
		
		for (i = 0; i < arr.length; i++) {	//행
			for (j = 0; j < arr[i].length; j++) {	//열
				System.out.print(arr[i][j] + ",");
			}
			System.out.println("\t" + arr[i].length);	//각 행의 길이
		}
	}

}
