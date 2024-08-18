public class twin_prime {
public static void main(String[] args) {
    for(int i=3;i<1000;i=i+2)
    {
        if(isPrime(i,i+2))
        {
            System.out.print("("+i+","+(i+2)+")");
            System.out.println();
        }
        
    }
}
public static boolean isPrime(int i,int j)
{
    for(int k=2,t=2;k<=i/2 && t<=j/2;k++,t++)
    {   
        if(i%k==0||j%t==0)

        return false;

    }
    return true;
}
}