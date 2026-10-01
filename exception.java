public class exception {
    public static void main(String[] args){
        try{
            int a=5,b=2,c;
            System.out.println("divide="+(a/b));
            c=a+b;
            System.out.println("sum="+c);
            int d=0;
              System.out.println("divide="+(b/d));
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
