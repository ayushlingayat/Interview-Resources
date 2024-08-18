import java.util.Scanner;
public class rec_bsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l =sc.nextInt();
        int arr[] =new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        bsearch(arr,x,0,l);
    }
    public static void bsearch(int arr[],int x,int m,int n)
    {
    
     int i=(m+n)/2;
        
        if(x==arr[i])
        {
            System.out.println(i);
        }
        else if(x<arr[i])
        {
            bsearch(arr, x,m,i);
        }
        else if(x>arr[i])
        {
            bsearch(arr, x, i, n);
        }
    }
}
