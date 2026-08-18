import java.util.Scanner;
public class studentpassandfail {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.println("enter marks:");
         int marks=sc.nextInt();
         if(marks>=40&&marks<=100){
            System.out.print("pass");
         }
         else{
            System.out.println("fail");
         }
         sc.close();
    }
}
