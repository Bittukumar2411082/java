
  import java.util.Scanner;
public class maths{
    public static void main(String[] args){
        //Maths
        int a=5,b=7;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        //random
        System.out.println((int)Math.random()*100);
        //input
        Scanner sc=new Scanner(System.in);
        System.out.println("take your input:");
        int age=sc.nextInt();
        float prices=sc.nextFloat();
        String name=sc.next();
        System.out.println("age="+age);
        System.out.println("prices="+prices);
        System.out.println("name="+name);
        
        sc.close();

    }
}
