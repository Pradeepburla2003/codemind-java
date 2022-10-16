import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int i=0,j,c=0;
        for(i=0;i<a;i++)
            b[i]=n.nextInt();
        for(i=0;i<a;i++){
            c=0;
            for(j=0;j<a;j++){
                if(b[i]==b[j]){
                    c++;
                }
            }
            if(c==2){
                System.out.printf("%d",b[i]);
                break;
            }
        }
    }
}