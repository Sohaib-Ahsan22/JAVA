import java.util.Scanner;
import java.util.Arrays;
public class SortString {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter number of entries:");
	int Entries= Scan.nextInt();
	String [] num= new String[Entries];
	System.out.println("please enter your entries");
	for(int i=0 ; i<Entries ; i++) {
		String b=Scan.next();
		num[i]=b;
	}
	for (String j : num ) {
		System.out.println(j);
	}
		Arrays.sort(num);
		System.out.println(num[0]);
	}

}
