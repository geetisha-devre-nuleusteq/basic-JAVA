package JavaBasicsFirstDay;
import java.util.Scanner;
public class SumOfMatrices {
	public static void main(String...ar)
	{
		Scanner sc=new Scanner(System.in);
		int [][]arr1=new int[2][2];
		System.out.println("enetr values in matrice1");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{arr1[i][j]=sc.nextInt();}
		}
		int [][]arr2=new int[2][2];
		System.out.println("enetr values in matrice2");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{arr2[i][j]=sc.nextInt();}
		}
		int [][]sum=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{sum[i][j]=arr1[i][j]+arr2[i][j];}
		}
		for(int i=0;i<2;i++)
			{for(int j=0;j<2;j++)
		System.out.print(sum[i][j]+" ");
		System.out.println();}
	}

}
