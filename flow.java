public class flow {
    public static void main(String[] args) {
        System.out.println("first");
        try{
            System.out.println("second");
            int a =20;
            int b=0;
            int c=a/b;
            System.out.println("third");
        }
        catch(ArithmeticException e){
          System.out.println("fourth");
          System.out.println("fifth");
        }
        System.out.println("sixth");
    }
}
