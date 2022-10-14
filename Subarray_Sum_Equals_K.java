import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int [] c=new int[a];
        int d=0,i,j,k;
        for(i=0;i<a;i++)
        {
            c[i]=n.nextInt();
        }
        for(i=0;i<a;i++)
        {
            k=0;
            for(j=i;j<a;j++)
            {
                k=k+c[j];
                if(k==b)
                {
                    d++;
                }
            }
        }
        System.out.printf("%d",d);
    }
}