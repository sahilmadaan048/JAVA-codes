
public class Oops {
    String name;
    int age;

    void init(String s, int n) {
        name = s;
        age = n;
    }


    void display() {
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        Oops obj = new Oops();
        
        
        Oops obj2 = new Oops();

        obj.name = "bingo";
        obj.age = 8;
        obj.display();
        
        obj2.init("murad", 1);
        obj2.display();
    }   
}