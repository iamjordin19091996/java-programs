class Box1{
    private int l,b,h;
    public void setDimension(int x,int y,int z){
        l=x; b=y; h=z;
    }
    public void showDimension(){
        System.out.println("Length :"+l);
        System.out.println("Breadth :"+b);
        System.out.println("Height :"+h);
    }
}
class Box{
    public static void main(String []args){
        Box1 b = new Box1();
        b.setDimension(12,10,5);
        b.showDimension();
    }
} 