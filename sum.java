import java.util.Scanner;
class Sum
{
        public static void main(String args[])

    {
        int n,sum=0;
        System.out.print("enter no of term");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
    System.out.print("addition "+sum);
    }

    

    
}
