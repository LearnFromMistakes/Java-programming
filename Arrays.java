package kavin.basicofjava;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args)
	{
		String [] Cars = new String[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<Cars.length;i=i+1)
		{
			Cars[i] = sc.nextLine();
		}
		System.out.println(Cars[1]);
		sc.close();
	} 
}
