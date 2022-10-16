import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i,j,c=0,k,t=0;
        for(i=0;i<a;i++)
            b[i]=n.nextInt();
        for(i=0;i<a;i++)
        {
            k=0;
            for(j=0;j<a;j++){
                if(b[i]==b[j]){
                    k++;
                }
            }
            if(k>c){
                c=k;
                t=b[i];
            }
        }
        System.out.printf("%d",t);
    }
}