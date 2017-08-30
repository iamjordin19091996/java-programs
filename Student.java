package pack2;
public class Student{
    private int rollNo;
    private String name;
    public void setRoll(int r){
        rollNo = r;
    }
    public void setName(String n){
        name = n;
    }
    public int getRoll(){
        return(rollNo);
    }
    public String getName(){
        return(name);
    }
}