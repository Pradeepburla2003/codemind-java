import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i,k=0;
        for(i=0;i<a;i++)
        {
            b[i]=n.nextInt();
        }
        int c=n.nextInt();
        for(i=0;i<a;i++)
        {
            if(b[i]>c)
            {
                k++;
            }
        }
        int t=a-k;
        System.out.printf("%d",t+k*2);
    }
}