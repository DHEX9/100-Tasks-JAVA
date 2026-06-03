import java.util.Scanner;

public class Task_20 {

    static int pow(int digito, int expoente){
        int total = 1;
        for(int i = 0; i < expoente; i++){
            total *= digito;
        }
        return total;
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Entre com seu número:");

        int num = scanner.nextInt(), num_copy = num;
        int expoente = String.valueOf(num).length();
        int digito = 0, result = 0;

        while(num != 0){
            digito = num % 10;
            result += pow(digito, expoente);
            num /= 10;
        }
        if(result == num_copy){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Não Armstrong");
        }
        scanner.close();
    }
}
