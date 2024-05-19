package kavin.basicofjava;
import java.util.Scanner;
public class Two_DArray {
	public static void main(String[] args)
	{
		int[][] Bottel = new int [3][3];
		Bottel[0][0] = 1;
		Bottel[0][1] = 2;
		Bottel[0][2] = 3;
		Bottel[1][0] = 4;
		Bottel[1][1] = 5;
		Bottel[1][2] = 6;
		Bottel[2][0] = 7;
		Bottel[2][1] = 8;
		Bottel[2][2] = 9;
//		
		Scanner sc = new Scanner(System.in);
		
//		for(int i = 0;i<3;i++)
//		{
//			for(int j =0;j<3;j++)
//			{
//				Bottel[i][j] = sc.nextInt();
//			}
//			System.out.println();
//		}
//		System.out.println(Bottel[2][2]);
//		sc.close();
//		System.out.println(Bottel.length);
		for (int i =0;i<Bottel.length;i++)
		{
			for(int j =0;j<Bottel.length;j++)
			{
				System.out.print(Bottel[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
