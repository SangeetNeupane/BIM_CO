package CO_practical;
import java.util.*;
class demo{
	 void subroutinecall()
	 {
		 System.out.println("Demo Of Subroutine Call.");
		 System.out.println("Enter The Two Number:-");
		 Scanner rz=new Scanner(System.in);
		 int a=rz.nextInt();
		 int b=rz.nextInt();
		 int Sum=a+b;
		 System.out.println("Sum of Two Number With SUBROUTINE CALL is "+Sum);
	 }
}
public class SubRoutineCall {

	public static void main(String[] args) {
		demo rk=new demo();
		rk.subroutinecall();

	}

}
