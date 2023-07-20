package JavaBasicsFirstDay;
import java.util.Scanner;
public class ArrayQue {
	public static void main(String...ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
				int num=sc.nextInt();
				 int[] arrr = new int [num];
				 System.out.println("enter array values");
				 for(int i=0;i<num;i++)
				 {
					 arrr[i]=sc.nextInt();
				 }
				 int i=0, max=arrr[i],avg=0;
				 for(;i<num;i++)
				 {avg=arrr[i]+avg;
					 if(max<arrr[i+1])
					 max=arrr[i];}
	System.out.println("largest array number is:"+ max); 
	avg=avg/num;
	System.out.println("average of the number is:"+avg);}
	

}
