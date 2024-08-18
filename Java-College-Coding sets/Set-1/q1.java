/*Write a java program to find greatest between two numbers without using if-else and
conditional operator. (in-built method should not be used)*/

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[2];
        arr[0]=a;
        arr[1]=b;
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
