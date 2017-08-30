import java.util.Scanner;
public class Factorial{
    public static void main(String []args){
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a no.");
        int a = k.nextInt();
        int f = 1;
        if(a>=0)
        {
        while(a!=0){
            f = f*a;
            a--;
        }
        System.out.println("The factorial is :"+f);
        }else{
            System.out.println("Invalid Input");
        }
        
    }
}