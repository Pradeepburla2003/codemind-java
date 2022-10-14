import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int i=1;
        double j,s=0;
        for(j=1.0;j<=a;j++)
        {
            s=s+(i/j);
    }
    System.out.printf("%.2f",s);
    }
}