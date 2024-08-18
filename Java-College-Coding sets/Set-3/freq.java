import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        System.out.println("enter character");
        char ch= sc.next().charAt(0);
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
