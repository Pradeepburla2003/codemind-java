import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int c=1,i;
        for(i=2;i<(a/2)+1;i++)
        {
         if(a%i==0)
            {
             c+=i;
            }
        }
        if(c==a)
            System.out.println("True");
        else
            System.out.println("False");
    }
}