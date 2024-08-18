import java.util.Scanner;

public class kth_smal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k value");
        int k=sc.nextInt();
        sort(arr,n);
        System.out.println("smallest kth element is: "+
        arr[k-1]);
    }
    public static void sort(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
