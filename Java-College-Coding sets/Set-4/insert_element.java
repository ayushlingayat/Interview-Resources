import java.util.Scanner;

public class insert_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to insert");
        int x=sc.nextInt();
        System.out.println("Enter position");
        int p=sc.nextInt();
        for(int k=n-1;k>p;k--)
        {
            arr[k]=arr[k-1];
        }
        arr[p]=x;

        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
