import java.util.Scanner;
class oddeven
{
    public static void main(String args[])
    {
        int n;
        System.out.print("enter any number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0)
        {
            System.out.print("even no.");
        }
        else
        {
            System.out.print("odd no");
        }
    }
}