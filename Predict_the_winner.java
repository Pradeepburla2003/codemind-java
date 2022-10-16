import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int [] b=new int[a];
        int [] c=new int[20];
        int i,j=0,k=0;
        for(i=0;i<a;i++){
            b[i]=n.nextInt();
            if(i%2==0){
                k+=b[i];
            }
            else{
                j+=b[i];
            }
        }
        if((k-j)%4==0)
            System.out.println("X");
        else
            System.out.println("Y");
    }
}