package CO_practical;
import java.util.*;
public class Memory_Heirachy 
{
	public static void main(String[] args) 
	{
		Scanner rz=new Scanner(System.in);
		Scanner rk=new Scanner(System.in);
		System.out.println("Enter The Memory Count You Have:-");
		int n=rz.nextInt();
		String a[]=new String [n];
		int i;
		System.out.println("Enter The Memory You Have:-");
		for( i=0;i<n;i++)
		{
			a[i]=rk.nextLine();
		}
		for( i=0;i<n;i++)
		{
			a[i]=a[i].toLowerCase();
		}
		System.out.println("Memory Heirarchy System In Which You Have:-");
		for(i=0;i<n;i++)
		{
			if(a[i].equals("register"))
			{
				System.out.println("Register :\nThe register is usually an SRAM or static RAM in the computer processor that is used to hold the data word that is typically 64 bits or 128 bits. A majority of the processors make use of a status word register and an accumulator. ");
			}
		}
		for( i=0;i<n;i++)
		{
			if(a[i].equals("cache"))
			{
				System.out.println("Cache :\nThe cache basically holds a chunk of information that is used frequently from the main memory. We can also find cache memory in the processor.");
			}
		}
		for( i=0;i<n;i++)
		{
			if(a[i].equals("main memory"))
			{
				System.out.println("Main Memory :\nThe main memory is nothing but the CPU’s memory unit that communicates directly. It’s the primary storage unit of a computer system ");
			}
		}
		for( i=0;i<n;i++)
		{
			if(a[i].equals("magnetic disks"))
			{
				System.out.println("Magnetic Disks :\nThe magnetic disks are circular plates that’s fabricated with plastic or metal with a magnetised material. Two faces of a disk are frequently used");
			}
		}
		for( i=0;i<n;i++)
		{
			if(a[i].equals("magnetic tapes"))
			{
				System.out.println("Magnetic Tapes :\nMagnetic tape refers to a normal magnetic recording designed with a slender magnetizable overlay that covers an extended, thin strip of plastic film. It is used mainly to back up huge chunks of data.");
			}
		}
	}

}
