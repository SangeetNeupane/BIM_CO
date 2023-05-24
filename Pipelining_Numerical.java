package CO_practical;
import java.util.*;
public class Pipelining_Numerical {

	public static void main(String[] args) {
		Scanner rz=new Scanner(System.in);
		System.out.println("Pipelining_Numerical");
		System.out.println("Enter The Number Of Task(n):-");
		int n= rz.nextInt();
		System.out.println("Enter The Number Of Segment(k):-");
		int k= rz.nextInt();
		System.out.println("Enter The Clock Pulse Time(tp):-");
		int tp= rz.nextInt();
		System.out.println("Enter (non-pipeline) Time(tn):-");
		int tn= rz.nextInt();
		
		double r=(n*tn)/((k+(n-1))*tp);
		System.out.println("Speed Of Ratio(r)= ~"+r);
	}

}
