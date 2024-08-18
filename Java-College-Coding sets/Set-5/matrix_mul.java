import java.util.Scanner;

public class matrix_mul {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][] a= new int [3][3];
        int [][] b= new int [3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int c[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][0]*b[0][j] + a[i][1]*b[1][j]+a[i][2]*b[2][j];
            }
        }
        System.out.println();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
