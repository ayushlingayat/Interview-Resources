import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer sb =new StringBuffer();
        sb.append(str);
        for(int i=0;i<sb.length();i++)
        {  
           int c=1;
            for(int j=i+1;j<sb.length();j++)
            {
                if(sb.charAt(i)==sb.charAt(j))
                {   sb.deleteCharAt(j);
                    c++;
                }
            }
            System.out.println(sb.charAt(i)+" - "+c);
        }
    }
}
