import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
