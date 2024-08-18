import java.util.Scanner;
public class dec_oct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String oct ="";
        while(n>0)
        {
            oct=(n%8)+oct;
            n=n/8;
        }
        System.out.println(oct);
    }
}
