import java.util.*;

public class TotalandAverage 

{
	
private static Scanner sc;

public static void main(String[] args) 
	
{
		
sc = new Scanner(System.in);
		
int a,b,c,total;
		
double avg=0.0;
		
System.out.println("Enter the marks of A subject: ");
		
a=sc.nextInt();
		
System.out.println("Enter the marks of B subject: ");
		
b=sc.nextInt();
		
System.out.println("Enter the marks of C subject: ");
		
c=sc.nextInt();
		
total=a+b+c;
		
avg=(total/3);
		
System.out.println("Total marks scored is "+total+" and average is "+avg);
	
}

}