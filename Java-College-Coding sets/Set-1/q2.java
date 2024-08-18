import java.util.Scanner;
/*
 Write a java program to divide a number by 4 without using / operator. 
 */
public class q2 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int k=n>>2;
    System.out.println(k);
}
}