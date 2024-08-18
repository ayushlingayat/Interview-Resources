import java.util.Scanner;
/*Write a java program to find sum of each row and each column of a given matrix. 
*/
public class q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter order of matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][] =new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("ROW SUM");
        for(int i=0;i<m;i++)
        {   int rs=0;
            for(int j=0;j<n;j++)
            {
                rs=rs+arr[i][j];
            }
            System.out.println(rs);
        }

        System.out.println("COL SUM");
        for(int j=0;j<n;j++)
        {   int cs=0;
            for(int i=0;i<m;i++)
            {
                cs=cs+arr[i][j];
            }
            System.out.println(cs);
        }
    }
}
