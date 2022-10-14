import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i=0,k=0,d=0;
        for(i=0;i<a;i++)
        {
            b[i]=n.nextInt();
            if(b[i]%2==0)
                k++;
            else
                d++;
        }
        System.out.printf("%d %d",k,d);
    }
}