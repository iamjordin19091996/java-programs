import java.util.Scanner;
public class AreaOfRectangle{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length :");
        int a = kb.nextInt();
        System.out.println("Enter the breadth :");
        int b = kb.nextInt();
        int s;
        s=a*b;
        System.out.println("Area :"+s);
    }
}