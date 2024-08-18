import java.util.Scanner;
/*Assume you have different currency notes of values Rs. 1, Rs 2, Rs. 5, Rs. 10, Rs. 20,
Rs. 50 and Rs. 100 respectively. Write a program to calculate the minimum number of
currency notes required to make a certain amount of Rs X. 
*/
public class q12 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
       int c=0;
       while(x>0){

       if(x>=100)
       {
        x=x-100;
        c++;
       }
       else if(x>20 && x<=50)
       {
           x=x-50;
           c++;
       }
       else if(x>10 && x<=20)
       {
           x=x-20;
           c++;
       }
       else if(x>5 && x<=10)
       {
           x=x-10;
           c++;
       }
       else if(x>2 && x<=5)
       {
           x=x-5;
           c++;
       }
       else if(x>1 && x<=2)
       {
           x=x-2;
           c++;
       }
       else 
       {
           x=x-1;
           c++;
       }
    }
    System.out.println(c);
   } 
}
