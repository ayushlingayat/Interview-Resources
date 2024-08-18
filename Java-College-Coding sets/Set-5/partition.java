import java.util.Scanner;
public class partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int arr[] =new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        parti(arr,x,0,l-1);

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
        else if(arr[lo]<=p)
        {
            parti(arr, p, ++lo, hi);
        }
        else if(arr[hi]>p)
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
