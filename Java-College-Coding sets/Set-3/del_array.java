import java.util.Scanner;
public class del_array {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter index element to delete");
    int x =sc.nextInt();
    int p=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==x)
        {
            p=i;
        }
    }
    
    for(int j=p+1;j<n;j++)
    {
        arr[j-1]=arr[j];
    }
    arr[n-1]=0;

    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
    
}