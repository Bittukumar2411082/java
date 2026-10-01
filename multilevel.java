class vehicle{
    void sound(){
        System.out.println("produce sound");
    }
}
class car extends vehicle{
    void carsound(){
        System.out.println("dhroom dhroom");
    }
}
class bike extends car{
    void bikesound(){
        System.out.println("bhroom bhroom");
    }
}
public class multilevel {
    public static void main(String[] args){
        bike b=new bike();
        b.sound();
        b.carsound();
        b.bikesound();
    }
    
}
