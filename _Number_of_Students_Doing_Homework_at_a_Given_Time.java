import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int [] c=new int[a];
        int i,s=0;
        for(i=0;i<a;i++){
            b[i]=n.nextInt();
        }
        int d=n.nextInt();
        for(i=0;i<d;i++)
            c[i]=n.nextInt();
        int k=n.nextInt();
        for(i=0;i<a;i++)
        {
            if(c[i]>=k && b[i]<=k){
                s++;
            }
        }
        System.out.printf("%d",s);
    }
}