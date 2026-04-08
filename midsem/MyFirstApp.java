// encapsulation
// abstraction
// inheritance
// polymorphism
// are predefines types are projects
// are custom defined types are projects
// all ops perforemed om onjects must be only throguh methods exposed on theh objects

// statically typed => variables datatypes must be declared before use

import java.io.IOException;

public class MyFirstApp {
    static double b = 10.5;

    // int a = 10; // will ive error
    static int a = 2;

    public static void main(String[] args) throws IOException {
        System.out.println("i rule");
        int $abc = 20;
        System.out.println($abc);
        int _abc = 4;
        System.out.println(_abc);
        System.out.println(2.3);
        System.out.println(2);
        // System.out.println(a);
        System.out.println(b);

        show();

        Student s = new Student();

        System.out.println(s.age); // accessed outside class

        s.show();

        System.out.println(1 == 1.0);
        System.out.println(1 == 1.1);

        int num1 = 10;
        num1 += num1;
        System.out.println(num1);

        System.out.println(num1++);
        System.out.println(num1--);

        System.out.println(num1 + 2);
        System.out.println(num1 - 2);

        // int a = 10;
        // if (a < 9) {
        // System.out.println("value is less than 9");
        // ++a;
        // System.out.println("value of a: " + a);
        // } else {
        // System.out.println(a);
        // }

        int c = 20;
        if (c < 8)
            System.out.println("value of c is less than 8");
        ++c;
        System.out.println("value of c is: " + c);

        int d = 19;
        if (d == 18) {
            System.out.println("age is 18");
        } else if (d > 18) {
            System.out.println("age is greater than 18");
        }

        // if (c==18) {}

        // System.out.println("age is 18");
        // else if (c>18)
        // {
        // System.out.println("age is greater than 18");
        // }
        // return;

        int e = 10, f = 5;

        if (e > f)
            ;
        else
            ;

        System.out.println("E is greater");
        System.out.println("F is greater");

        int g = 10, h = 5, i = 2;

        // if(g > h || ++i == 3) {
        // System.out.println("g is greater");
        // }
        // else
        // System.out.println("h is greater");
        // System.out.println(i);
        if (g > h && ++i == 3) {
            System.out.println("g is greater");
        } else
            System.out.println("h is greater");
        System.out.println(i);

        int var = 15;
        // while(var > 10);

        System.out.println("hello hi");
        // int aa = 110; // wil give error here => unreachable statement
        // System.out.println(aa);

        outer:

        for (int k = 1; k <= 3; k++) {
            for (int j = 1; j <= 3; j++) {
                if (k == 2) {
                    break outer;
                }
                System.out.println(k + " " + j);
            }
        }

        System.out.println("---------------------------------");
        for (int k = 1; k <= 3; k++) {
            for (int j = 1; j <= 3; j++) {
                if (k == 2) {
                    break;
                }
                System.out.println(k + " " + j);
            }
        }
        System.out.println("---------------------------------");

        for (int k = 1; k <= 3; k++) {
            for (int j = 1; j <= 3; j++) {
                if (k == 2) {
                    continue;
                }
                System.out.println(k + " " + j);
            }
        }
        System.out.println("---------------------------------");

        // do while loop
        char choice;

        do {
            System.out.println("help on: ");
            System.out.println("1. If");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do while");
            System.out.println("5. for");
            System.out.print("Choose one: ");

            choice = (char) System.in.read();

        } while (choice < '1' || choice > '5');

        for (int k = 0; k < 10; k++) {
            // System.err.println();
        }
        for (int k = 0; k < 10; k++) {
            System.err.println(k);
        }

        System.out.println("-----------------");

        for (int aaa = 5; aaa < 10; aaa++) {
            System.out.println(aaa);
        }
        System.out.println("-----------------");
        System.out.println(a);

        System.out.println("-----------------");
        // for (;; a++) {
        //     System.out.println(a); // infinite loop
        // }


        // after infinite loop, anything written becomes the unreachable statement
        
        
        // for (; a < 10;) {
        //     System.out.println(a);  // infinite loop
        // }

        System.out.println("------------");
        // break statament
        for(int k=0; k<100; k++) {
            if(k == 10) break;
            System.out.println("k: "+k);
        }

        System.out.println("loop complete");


        System.out.println("-------------");
        
        // labelled break => using break as a form of goto
        for(int k=0; k<5; k++) {
            for(int j=0; j<5; j++) {
                System.out.println("inner loop");
            }
            System.out.println("outer loop --------------");
        }
        System.out.println("-------------");

        // break here is beinging the control otut of the inner loop only
        for(int k=0; k<5; k++) {
            for(int j=0; j<5; j++) {
                System.out.println("inner loop");
            }
            System.out.println("outer loop --------------");
        }
        System.out.println("-------------");



        // byte var1 = 190; // will give erorr
        byte temp = 10;
        System.out.println(((Object)temp).getClass().SimpleName());

        byte var1 = (byte)190;
        int var2 = var1;
    
        System.out.println(var1);
        System.out.println(var2);

        System.out.println("-----");
    }

    static void show() {
        // System.out.println(a);
        int bb = 10;
        System.out.println(bb);
    }
}

class A {
    public static void main(String[] args) {
        System.out.println("A main");
    }
}

class B {
    public static void main(String[] args) {
        System.out.println("B main");
    }
}

class Student {

    int age = 20; // instance variable

    void show() {
        System.out.println(age); // accessed inside class
    }
}

// for classes => PascalConvebtion
// for functions => camelCaseConvention

/*
 * not beign with alphabe
 * not with a digit
 * case sensitive
 * not a keyword
 * white space not allowes
 * can contain alphabets $, _ and digits if other conditions specified
 * 
 * 
 */