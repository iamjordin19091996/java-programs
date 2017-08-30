import java.util.Scanner;
public class SumOfN{
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = kb.nextInt();
        int i,total=0;
        for(i=1;i<=n;i++)
        {
            total = total+i*2;
        }
        System.out.println("Sum is :"+total);
    }
}