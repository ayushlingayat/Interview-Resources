import java.util.*;
import java.io.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]=str.split(" ");
        int n=arr.length;
        for(int i=0;i<n;i++)
        {   StringBuilder input = new StringBuilder();
            input.append(arr[i]);
            System.out.print(input.reverse()+" ");
        }
    }
}
