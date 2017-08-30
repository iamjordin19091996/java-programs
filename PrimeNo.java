import java.util.Scanner;
public class PrimeNo{
    public static void main(String []args){
    int i=2;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a no. :");
    int num = kb.nextInt();
    int x;
    x = num/2;
    int flag = 0;
    if(num<0){
        System.out.println("Enter a Positive No.");
        flag = 1;
    }
    while(i<=x){
        if(num%i==0){
            flag = 1;
            System.out.println("Not a prime no.");
            break;
        }
        i++;
    }
    if(flag == 0){
        System.out.println("Prime No.");
    }
}
}