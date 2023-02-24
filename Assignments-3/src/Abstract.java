import java.util.Scanner;

abstract class A {
    int prod;

    abstract void m1(int p, int q);

    void m2() {
        System.out.println(prod);
    }
}

class B extends A {
    void m1(int p, int q) {
        prod = p * q;
    }
}

public class Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            A obj = new B();
            obj.m1(a1, a2);
            obj.m2();
        }
        sc.close();
    }
}