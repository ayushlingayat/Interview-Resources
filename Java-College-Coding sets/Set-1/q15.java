public class q15 {
    /*Pattern*/
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {   
            int space = 5-i;
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            int alpha = 65;
            for(int a=i-2;a>=0;a--)
            {
                System.out.print((char)(alpha+a)+" ");
            }
            System.out.println();
        }
    }
}
