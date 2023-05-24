package CO_practical;
import java.util.Scanner;
public class Cache_Memory_Numerical {
	
	public static void main(String[] args) 
		{
		Scanner rz=new Scanner(System.in);
		System.out.println("Cache_Memory_Numerical");
		System.out.println("Enter The Cache Access Time:-");
		int a= rz.nextInt();
		System.out.println("Enter The RAM Access Time:-");
		int b= rz.nextInt();
		System.out.println("Enter The Hit ratio in decimal:-");
		double c= rz.nextDouble();
		
		double d=c*a+((1-c)*b);
		System.out.println("Average Memory Access Time= ~"+d);
	}

}
