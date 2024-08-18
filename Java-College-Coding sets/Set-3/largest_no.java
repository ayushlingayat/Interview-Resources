import java.util.Arrays;
import java.util.Scanner;

public class largest_no {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n =sc.nextInt();
       int arr[] =new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
       String str="";
       for(int i=0;i<n;i++)
       {
           str=arr[i]+str;
       }
       System.out.println(str);
       } 
}
