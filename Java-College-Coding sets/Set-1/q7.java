import java.util.Scanner;
/*
Write a java program to find second largest element from a given unsorted integer array. 
*/
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int max_2=0;
        for(int i=0;i<l;i++)
        {
            if(arr[i]>max)
            {
                max_2=max;
                max=arr[i];
            }
        }
        System.out.println(max_2);
    }
}
