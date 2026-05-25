import java.util.Scanner;

public class Task_7 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int num, atual = 0, proximo = 1, aux;

        System.out.println("Digite o número de termos:");
        num = scanner.nextInt();

        for(int i = 0; i < num - 1; i++){
            System.out.print(atual + ", ");
            
            aux = atual + proximo;
            atual = proximo;
            proximo = aux;
        }
        System.out.print(atual);
    }
}
