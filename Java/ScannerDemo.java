import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name = ");
        String name = sc.next();
        System.out.println("Enter your Age is");
        int age = sc.nextInt();
        System.out.println("Enter the Temperature =");
        Double temperature = sc.nextDouble();
        System.out.println("Enter the character = ");
        char c = sc.next().charAt(0);

        System.out.println("NAME = " + name);
        System.out.println("Temperature = "+ temperature);
        System.out.println("AGE = " + age);
        System.out.println("CHARACTER = " + c);

        sc.close();
    }
    
}
