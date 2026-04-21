package pack2;

import pack1.ClassA;

public class ClassB extends ClassA {

    public static void main(String[] args) {

        ClassA obj = new ClassA();

        System.out.println("From different package (non-subclass object):");
        System.out.println("Public: " + obj.publicVar);

        ClassB child = new ClassB();
        System.out.println("From subclass:");
        System.out.println("Protected: " + child.protectedVar);
    }
}