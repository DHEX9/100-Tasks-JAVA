import java.util.Scanner;

public class Task_11 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Entre com seu número:");
        int num = scanner.nextInt();
        scanner.close();

        for(int i = 0; i <= 10; i++){
            System.out.println(num + "x" + i + " = " + num*i);
        }
    }
}
