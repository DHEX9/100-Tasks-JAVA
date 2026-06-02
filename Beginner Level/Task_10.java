import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {

    static Scanner scanner = new Scanner(System.in);
    
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

    static int[] boobleSort(int[] nums){
        int aux = 0;

        for(int i = nums.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[j+1]){
                    aux = nums[j+1]; 
                    nums[j+1] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){

        //Pega N nums até o enter
        System.out.println("Entre com seus numeros:");
        String linha = scanner.nextLine();
        scanner.close();
        
        //Transforma linha str em int array
        int[] nums = criaArray(linha);

        //Algoritmo de ordenação
        nums = boobleSort(nums);
        
        System.out.println(Arrays.toString(nums));
    }
}
