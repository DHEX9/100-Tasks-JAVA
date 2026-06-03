import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args){
        System.out.print("Entre com um decimal: ");

        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        String binary = "";
        scanner.close();

        if(decimal == 0){
            System.out.println("0");
            return;
        }

        while(decimal > 0){
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        System.out.println(binary);
    }
}
