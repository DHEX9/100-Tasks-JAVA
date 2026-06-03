import java.util.Scanner;

public class Task_14 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Entre com seu número:");
        int num = scanner.nextInt(); int total = 0, digito = 0;
        scanner.close();

        while(num != 0){
            digito = num % 10;
            num /= 10;
            total += digito;
        }

        System.out.println(total);
    }
}
