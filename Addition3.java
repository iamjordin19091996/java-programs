public class Addition3{
    public static void main(String []args){
        if(args.length==2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int s;
            s = a+b;
            System.out.println("Sum :"+s);
        }
        else{
            System.out.println("Wrong No. of arguements.");
        }
    }
}