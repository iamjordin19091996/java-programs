class A extends Thread{
    public void run(){
        int i ;
        for(i=0;i<10;i++){
            System.out.println("i="+i);
        }
    }
}
class B extends Thread{
    public void run(){
        int i ;
        for(i=0;i<10;i++){
            System.out.println("j="+i);
        }
    }
}
public class ThreadNew{
    public static void main(String []args){
        A o1 =new A();
        B o2 =new B();
        o1.start();
        o2.start();
    }
}