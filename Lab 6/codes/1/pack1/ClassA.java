package pack1;

public class ClassA {

    public int publicVar = 10;
    private int privateVar = 20;
    int defaultVar = 30;          
    protected int protectedVar = 40;

    public void display() {
        System.out.println("Inside ClassA:");
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
    }
}