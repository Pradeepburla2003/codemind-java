import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i,d=0,k=0;
        for(i=0;i<a;i++){
            b[i]=n.nextInt();
            d=0;
            while(b[i]>0){
                d++;
                b[i]=b[i]/10;
            }
            if(d%2==0){
                k++;
            }
        }
        System.out.printf("%d",k);
    }
}