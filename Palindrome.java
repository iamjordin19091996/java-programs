import java.util.Scanner;
public class Palindrome{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a no. :");
        int num = kb.nextInt();
        int num1 = num;
        int rem,div;
        int rev = 0;
        while(num1!=0){
            rem = num1%10;
            num1 = num1/10;
            rev = rev*10 + rem;
        }
        if(num==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}