import java.io.FileReader;
import java.io.FileNotFoundException;

public class file {
    public static void main(String[] args){
        try{
            FileReader file=new FileReader("kbc.txt");
            System.out.println("file opened successfully");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
