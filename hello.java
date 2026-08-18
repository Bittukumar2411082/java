import java.util.Arrays;
public class hello{
    public static void main(String[]args){
        System.out.println("Hello World");
        String name="bittu";
        System.out.println(name.charAt(1));
        String name2=name.replace('b','B');
        System.out.println(name2);
        int[] marks= new int[3];
        marks[0]=85;
        marks[1]=90;
        marks[2]=78;
        System.out.println(marks[1]);
        System.out.println(marks.length);
        Arrays.sort(marks);
     System.out.println(Arrays.toString(marks));
    }
    }
