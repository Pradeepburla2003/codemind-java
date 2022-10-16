import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i=0,c,k=1;
        for(i=0;i<a;i++)
            b[i]=n.nextInt();
        while(k<=a){
            c=0;
            for(i=0;i<a;i++){
                if(b[i]==k){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.printf("%d",k);
                break;
            }
            k++;
        }
    }
}