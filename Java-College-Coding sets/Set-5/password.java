import java.util.Scanner;
public class password {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    if(valid_pass(str))
    {
        System.out.println("valid pasword");
    }
    else
    {
        System.out.println("invalid password");
    }
}
public static boolean valid_pass(String str){
    int count_d=0;
if(str.length()>=8)
{   
   for(int i=0;i<str.length();i++)
   {   char c =str.charAt(i);
       if(Character.isLetter(c));
      else if(Character.isDigit(c))
       {
           count_d++;
       }
       else return false;
   }
   if(count_d>=2)
       return true;
       else
       return false;
}
else return false;
}
}