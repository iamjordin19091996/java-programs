import java.util.Scanner;
public class Fibonacci{
    public static void main(String []args){
        int a,b,c;
        a = 0;
        b = 1;
        int i = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a no.");
        int k = kb.nextInt();
        
        System.out.println("The Fibonacci series is :");
        while(i<k){
            System.out.println(a);
            //System.out.println(b);
            c = a+b;
            a = b;
            b = c;
            i++;
        }
    }
}