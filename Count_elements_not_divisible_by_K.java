import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int [] c=new int[a];
        int d=0;
        for(int i=0;i<a;i++)
        {
            c[i]=n.nextInt();
            if(c[i]%b!=0){
                d++;
            }
        }
        System.out.printf("%d",d);
    }
}