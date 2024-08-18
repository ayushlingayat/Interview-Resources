/*Write a java program to check whether a number is even or not without using arithmetic
or relational operator. 
*/
import java.util.Scanner;

public class q5{

	static int isEven(int n) {
		
		return(n&1);
	}
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int n = sc.nextInt() ;
		int i=0;  
		String s=String.valueOf(i);
        int k=isEven(n);
        String ch =Integer.toString(k);
		if(ch.equals("0")) 
			System.out.println("even");
		else
			System.out.println("odd");
	
	}

}