import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i,j,c,k=0,t=0;
        for(i=0;i<a;i++)
        {
            b[i]=n.nextInt();
        }
        for(i=0;i<a;i++)
        {
            c=0;
            for(j=0;j<a;j++)
            {
                if(i!=j && b[i]==b[j]){
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                if(b[i]>t)
                {
                    t=b[i];
                }
                k++;
            }
        }
        if(k!=0){
            System.out.printf("%d",t);
        }
        else
            System.out.println(-1);
    }
}