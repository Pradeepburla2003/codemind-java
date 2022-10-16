import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int c=n.nextInt();
        int i,j=0,k=0,d=0;
        for(i=0;i<a;i++)
            b[i]=n.nextInt();
        for(i=0;i<a;i++){
            if(b[i]<=c){
                j++;
            }
            else{
                k++;
            }
            if(k==2){
                break;
            }
        }
        System.out.printf("%d",j);
    }
}