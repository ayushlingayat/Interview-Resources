import java.util.Scanner;
/*Write a java program to arrange the element of an integer array so that all negative
element will be at one side and all positive element will be in other side. 
*/
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int arr[] =new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int p=0;
        for(int i=0;i<l;i++)
        {
            if(arr[i]==x)
            p=i;
        }
        parti(arr,p,0,l-1);

        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void parti(int arr[], int p,int lo,int hi)
    {
        if(lo>hi)
        {
            return;
        }
        else if(arr[lo]<0)
        {
            parti(arr, p, ++lo, hi);
        }
        else if(arr[hi]>=0)
        {
            parti(arr, p, lo, --hi);
        }
        else if(lo<hi)
        {
            int c=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=c;
        }
        
    }
    }
