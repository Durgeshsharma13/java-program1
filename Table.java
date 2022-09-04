//multiplication table
import java.util.Scanner;

class Table 
{
    public static void main(String args[])
    {
        int num;
        System.out.print("enter any no");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);

        }
    }
}
