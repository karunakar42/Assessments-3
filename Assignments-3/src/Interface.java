import java.util.Scanner;

interface in1 {
    void display(int p);
}

class testClass implements in1 {
    public void display(int p) {
        int count = 0;
        for (int i = 2; i <= p; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                count++;
        }
        System.out.println(count);
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        in1 obj = new testClass();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            obj.display(n);
        }
        sc.close();
    }
}