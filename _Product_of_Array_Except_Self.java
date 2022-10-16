import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i=0,j,k;
        for(i=0;i<a;i++)
            b[i]=n.nextInt();
        for(i=0;i<a;i++){
            k=1;
            for(j=0;j<a;j++){
                if(i!=j){
                k=k*b[j];
                }
            }
            System.out.printf("%d ",k);
        }
    }
}