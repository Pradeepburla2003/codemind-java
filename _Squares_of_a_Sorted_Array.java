import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int [] c=new int[a];
        int i,j,k=0,m=0;
        for(i=0;i<a;i++){
            b[i]=n.nextInt();
            c[k]=b[i]*b[i];
            k++;}
        for(i=0;i<a-1;i++){
            for(j=0;j<a-1;j++){
                if(c[j]>c[j+1]){
                    m=c[j];
                    c[j]=c[j+1];
                    c[j+1]=m;}
            }
        }
        for(i=0;i<a;i++)
            System.out.printf("%d ",c[i]);
    }
}