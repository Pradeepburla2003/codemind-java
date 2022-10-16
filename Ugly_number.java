import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int c=0;
        while(a!=0)
        {
            if(a==1){
                break;}
            else if(a%2==0){
                a=a/2;}
            else if(a%3==0){
                a=a/3;}
            else if(a%5==0){
                a=a/5;}
            else{
                c=1;
                break;
            }
        }
        if(c==0)
            System.out.println("Ugly Number");
        else
            System.out.println("Not Ugly Number");
    }
}