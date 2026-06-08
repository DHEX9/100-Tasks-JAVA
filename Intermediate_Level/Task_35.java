import java.util.Scanner;

public class Task_35 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor 'a': ");
        int a = scanner.nextInt();
        System.out.print("Entre com o valor 'b': ");
        int b = scanner.nextInt();
        scanner.close();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("\na: %d, b: %d", a, b);
    }
}