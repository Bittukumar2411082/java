
    class Student {

    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
public class objectexample {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.marks = 85;

        s1.display();
    }
}
}     

