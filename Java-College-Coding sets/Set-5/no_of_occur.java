import java.util.Scanner;

public class no_of_occur {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l=sc.nextInt();
        int arr[]=new int[l];

        
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<l;k++)
        {
            count_occur(arr[k], arr);
        }
        sc.close();
    }
    public static void count_occur(int x,int arr[])
    {   int c=0;
        for(int j=0;j<arr.length;j++)
        {
            if(x==arr[j])
            {
                c++;
            }
        }
        System.out.println(x +" occurs "+c+" times ");
    }
}
