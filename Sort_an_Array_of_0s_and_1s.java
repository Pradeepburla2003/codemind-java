import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i,c=0,k=0,s=1;
        for(i=0;i<a;i++)
        {
            b[i]=n.nextInt();
            if(b[i]==0)
            {
                c++;
            }
        }
        for(i=0;i<c;i++)
        {
            System.out.printf("%d ",k);
        }
        for(i=c;i<a;i++)
        {
            System.out.printf("%d ",s);
        }
    }
}