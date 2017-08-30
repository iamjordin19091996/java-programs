import java.util.Scanner;
class A implements Runnable{
    public void run(){
        int i;
        for(i=0;i<10;i++)
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Thread A"+i);
            
            if (i==5){
                System.out.println(" Enter :");
                int a = kb.nextInt();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Thread B"+i);
        }
    }
}
public class Thread1{
    public static void main(String []args){
        Thread t1 =new Thread(new A());
        Thread t2 =new Thread(new B());
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
    }
}
