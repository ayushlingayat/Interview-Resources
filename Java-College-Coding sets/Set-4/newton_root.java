import java.util.Scanner;

public class newton_root {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n =sc.nextInt();
        double x=n;
        double root;
        while(true)
        {
            root =0.5*(x+(n/x));

            if(Math.abs(root-x)<0.5)
            break;

            x=root;
        }
        System.out.println(root);
    }
}
