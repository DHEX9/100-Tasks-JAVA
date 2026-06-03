import java.util.Scanner;

public class Task_19 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Entre com seu número:");

        int num = scanner.nextInt(), counter = 0;
        scanner.close();

        //Com string
        String str_num = String.valueOf(num);
        System.out.println("Com string: " + str_num.length());

        //Com int
        while(num != 0){
            num /= 10;
            counter++;
        }

        System.out.println("Com int: " + counter);
    }
}
