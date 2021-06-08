import java.util.Scanner;

public class Matrix {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		
      System.out.println("enter the order of matrix1");
      byte m=scan.nextByte();
      byte n=scan.nextByte();
      int mtr[][]=new int[m][n];
      System.out.println("Enter the matrix elements");
      for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			mtr[i][j]=scan.nextInt();
		}
      }
      System.out.println("enter the order of matrix2");
      byte m1=scan.nextByte();
      byte n1=scan.nextByte();
      int mtr1[][]=new int[m1][n1];
      System.out.println("Enter the matrix elements");
      for (int i = 0; i < m1; i++) {
		for (int j = 0; j < n1; j++) {
			mtr1[i][j]=scan.nextInt();
		}
	}
//      for (int i = 0; i < m1; i++) {
//			for (int j = 0; j < n1; j++) {
//				System.out.println(mtr1[i][j]);
//			}
//      }
      if(n==m1) {
      matrixMultiplication(mtr,m,n,mtr1,m1,n1);
	}else {
		System.out.println("Matrix multiplcation is not possible");
	}
     // sumOfRow(mtr,m,n);
     // transpose(mtr,m,n);
      scan.close();
}

	private static void transpose(int[][] mtr, byte m, byte n) {
		// TODO Auto-generated method stub
		int[][] mtr1=new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mtr1[i][j]=mtr[j][i];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mtr1[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void sumOfRow(int[][] mtr,int m,int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] sumColumn=new int[n];
	//	int[] sumRow=new int[m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				//sum=sum+mtr[i][j];
				sum=sum+mtr[j][i];
				
			}
			//sumRow[i]=sum;
			sumColumn[i]=sum;
			sum=0;
		}
		for (int i = 0; i < sumColumn.length; i++) {
			System.out.println("Column"+(i+1)+":"+sumColumn[i]);
		}
//		for (int i = 0; i < sumRow.length; i++) {
//			System.out.println("Row"+(i+1)+":"+sumRow[i]);
//		}
	}
	

	private static void matrixMultiplication(int[][] mtr, byte m, byte n, int[][] mtr1, byte m1, byte n1) {
		// TODO Auto-generated method stub
		int[][] resultMatrix=new int[m][n1];
		int sum=0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n1; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					sum=sum+mtr[i][j2]*mtr1[j2][j];
				}
				resultMatrix[i][j]=sum;
				sum=0;
			}
		}
		for (int i = 0; i <m; i++) {
			for (int j = 0; j <n1; j++) {
				System.out.print(resultMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}