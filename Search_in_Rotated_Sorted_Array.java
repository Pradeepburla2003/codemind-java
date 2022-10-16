import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i,j=0;
        for(i=0;i<a;i++)
            b[i]=n.nextInt();
        int c=n.nextInt();
        for(i=0;i<a;i++)
        {
            if(b[i]==c){
                System.out.printf("%d",i);
                j++;
                break;
            }
        }
        if(j==0)
            System.out.printf("%d",-1);
    }
}