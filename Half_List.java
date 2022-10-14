import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i=0;
        for(i=0;i<a;i++)
        {
            b[i]=n.nextInt();
        }
        int k=a/2;
        for(i=a-1;i>=k;i--)
        {
            System.out.printf("%d ",b[i]);
        }
        for(i=0;i<k;i++)
        {
            System.out.printf("%d ",b[i]);
        }
    }
}