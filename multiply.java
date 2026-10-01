import java.util.Scanner;
public class multiply{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter number:");
       int num= sc.nextInt();
       int i=1;
       while(i<=10){
        int mul=num*i;
        System.out.println(num +"X"+i +"=" + mul);
        i++;
       }
       sc.close();

    }
}