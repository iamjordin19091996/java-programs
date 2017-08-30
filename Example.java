package pack1;
import pack2.Student;
public class Example{
    public static void main(String []args){
        Student s1 = new Student();
        s1.setRoll(100);
        s1.setName("NirajModi");
        System.out.println("Roll No:"+s1.getRoll());
        System.out.println("Name:"+s1.getName());
    }
}
