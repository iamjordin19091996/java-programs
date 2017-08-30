public class Exception{
    public static void main(String []args){
        int balance=5000;
        int withdrawalAmount=6000;
        try{
            
       
        if(balance<withdrawalAmount)
            throw new ArithmeticException("Insufficient Balance");
        balance = balance-withdrawalAmount;
        }
        catch(ArithmeticException e){
            System.out.println("Exception :"+e.getMessage());
        }
        System.out.println("Transaction Completed");
    }
}