import java.util.Scanner;
import java.util.Arrays;
public class remove_dupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int arr[] =new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int temp[] =new int[l];
        int j=0;
        for(int i=0;i<l;i++){
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[l-1];
        for(int i=0;i<l;i++)
        {
            System.out.print(temp[i]);
        }
    }
}
