import java.util.Scanner;

public class Task_16 {

    static int[] criaArray(String linha){

        //str -> str[]
        String[] partes = linha.trim().split("\\s+");
        int[] nums = new int[partes.length];

        //str[] -> int[]
        for(int i = 0; i < partes.length; i++){
            nums[i] = Integer.parseInt(partes[i]);
        }
        return nums;
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Entre com uma sequencia de números:");
        String linha = scanner.nextLine();
        scanner.close();

        int[] nums = criaArray(linha);

        int menor = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < menor){
                menor = nums[i];
            }
        }
        System.out.println(menor);
    }
}
