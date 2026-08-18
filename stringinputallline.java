import java.util.Scanner;
public class stringinputallline {
    public static void main(String[] args) {
        System.out.println("enter your sentence:");
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        System.out.println("sentence="+sentence);
        sc.close();
    }
 
    
}
