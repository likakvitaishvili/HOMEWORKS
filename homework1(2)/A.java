package com.company;

import java.util.Scanner;

class A {
    public static int x = 0;

    public A () {
        System.out.println("Hello !");
    }

    public  void methodOne() {
        System.out.println("Enter x: ");
        Scanner inpObj = new Scanner(System.in);
        x = inpObj.nextInt();
    }

    public void methodTwo() {
        int res = A.x + 12;
        System.out.println("x + 12 = " + res);
    }

    public boolean methodThree() {
        return A.x % 2 == 0;
    }

    public static void main(String[] args) {
        A con = new A();
        con.methodOne();
        con.methodTwo();
        System.out.println(con.methodThree());

        B childClass = new B();
        childClass.methodOne();
        childClass.Method1();
        System.out.println(childClass.Method2());
    }
}
