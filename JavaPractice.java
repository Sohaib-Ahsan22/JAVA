import java.util.Scanner;
import java.util.Arrays;
class JavaPractice
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of Entries:");
        int entries= sc.nextInt();
	int num[];
	num = new int[entries];
	for( int i=0; i<entries; i++)
	{
	 System.out.println("Enter a number:");
	 int b = sc.nextInt();
	 num[i]= b;
	}
	 System.out.println("Your List is");
	for (int i=0 ; i<entries ; i++)
	 {
	 System.out.println(num[i]);
	 	
	 }
	
	Arrays.sort(num);
	
	System.out.println(num[entries-1]);
	





    }
}
