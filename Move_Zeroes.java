import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int [] c=new int[a];
        int i,j=0;
        for(i=0;i<a;i++){
            b[i]=n.nextInt();
            if(b[i]!=0){
                c[j]=b[i];
                j++;
            }
        }
        for(i=0;i<j;i++)
            System.out.printf("%d ",c[i]);
        for(i=j;i<a;i++)
            System.out.printf("%d ",0);
    }
}