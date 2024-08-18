/* Write a java program to remove duplicate element from a sorted array without using any
other data structure including array. 
*/
import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int k=remove(arr,l);
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int remove(int arr[],int l)
    {
        if(l==0||l==1)
        {
            return l;
        }
        int j=0;
        for(int i=0;i<l-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[l-1];
        return j;
    }
}
