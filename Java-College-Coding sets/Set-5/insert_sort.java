import java.util.Scanner;

public class insert_sort {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int arr[]=new int[l];
    for(int i=0;i<l;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=1;i<l;i++)
    {
        int key =arr[i];
        int j=i-1;
    
    while(j>=0 && arr[j]>key)
    {
        arr[j+1]=arr[j];
        j=j-1;
    }
    arr[j+1]=key;
   } 
   for(int i=0;i<l;i++){
    System.out.print(arr[i]+" ");
}
}
}
