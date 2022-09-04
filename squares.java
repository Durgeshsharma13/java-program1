import java.util.Scanner;
public class squares {
    public static void main(String[] args){
        int side,area;
        System.out.print("Enter side square");
        Scanner r=new Scanner(System.in);
        side=r.nextInt();

        area=side*side;
        System.out.print("Area of Square"+area);
        
    }
    
}
