import java.util.Scanner;
public class prime{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = kb.nextInt();
        int flag=0;
        int i;
        for(i=2;i<=n/2;i++){
            int div=1;
            div = n%i;
            if(div==0){
                flag=1;
                System.out.println("Not a prime no.");
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime No.");
        }
    }
}