import java.util.Scanner;

public class Task_3 {
    static Scanner scanner = new Scanner(System.in);

    static int maiorQue(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }
    public static void main(String[] args){
        int num1, num2, num3, maior;

        System.out.println("Digite 3 números:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        maior = maiorQue(num1, num2);
        maior = maiorQue(maior, num3);

        System.out.println("Maior numero: " + maior);
        scanner.close();
    }
}