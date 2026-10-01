import java.util.Scanner;
public class multiply2{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter number:");
       int num= sc.nextInt();
       int i=1;
       do{
        int multi=num*i;
        System.out.println(num +"X"+i +"=" + multi);
        i++;
       }while(i<=10);
       sc.close();

    }
}