import java.util.Scanner;

public class addtwono {
    public static void main(String[] args) {
        System.out.println("enter the first no: ");
        Scanner sc  =  new Scanner(System.in);
        
        int a = sc.nextInt();
        System.out.println("enter the second no: ");

        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of two no is : " + sum);
        return;
    }
}
