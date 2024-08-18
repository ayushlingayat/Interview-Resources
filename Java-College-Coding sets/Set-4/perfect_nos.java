public class perfect_nos {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++)
        {
            if(perfect(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean perfect(int n)
    {
        int sum=1;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0 && n/i!=i && n/i!=n) 
            {   
                sum=sum+i+n/i;
            }
        }
        if(sum==n)
        {
            return true;
        }
        else
        return false;
    }

}
