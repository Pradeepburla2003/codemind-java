import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i,c=0;
        for(i=0;i<a;i++)
        {
            b[i]=n.nextInt();
        }
        for(i=0;i<a-1;i++){
            if(b[i]>b[i+1])
            {
                c++;
            }
        }
        if(c==a-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}