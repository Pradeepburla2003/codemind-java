import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int [] c=new int[20];
        int i,j,d,k=0;
        for(i=0;i<a;i++)
            b[i]=n.nextInt();
        for(i=0;i<a;i++)
        {
            d=0;
            for(j=0;j<a;j++){
                if(i!=j && b[i]>b[j]){
                    d++;
                }
            }
            c[k]=d;
            k++;
        }
        for(i=0;i<a;i++)
            System.out.printf("%d ",c[i]);
    }
}