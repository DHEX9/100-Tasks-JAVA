import java.util.Scanner;

public class TAsk_3 {
    static Scanner scanner = new Scanner(System.in);

    static int maiorque(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }
    public static void main(String[] args){
        int num1, num2, num3, maior;

        System.out.println("Entre com os números:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        maior = maiorque(num1, num2);
        maior = maiorque(maior, num3);

        System.out.println(maior);
    }
}