public class tower_of_hanoi {
    public static void main(String[] args) {
        int n=4;
        toh(n,'A','B','C');
    }
    public static void toh(int n,char src,char aux,char des)
    {   if(n==1)
        {
        System.out.println("move "+n+" from "+src+" to "+des);
        return;
        }
        toh(n-1,src,des,aux);
        System.out.println("move "+n+" from "+src+" to "+des);
        toh(n-1,aux,src,des);
    }
}
