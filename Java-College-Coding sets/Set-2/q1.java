import java.util.Scanner;
/*Write a java program to reverse a string*/
public class q1{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a string");
    String str =sc.nextLine();
    int l =str.length();
    String nst="";
    for(int i=l-1;i>=0;i--)
    {
        nst=nst+str.charAt(i);
    }
    System.out.println(nst);
}
}