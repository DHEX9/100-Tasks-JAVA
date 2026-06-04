import java.util.Scanner;

public class Task_24 {

    static int[] createArray(){
        System.out.print("Entre com seu array: ");

        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().trim().split("\\s+");
        int[] nums = new int[parts.length];
        scanner.close();

        for(int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        return nums;
    }

    static int[] sort(int[] nums){
        for(int i = nums.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(nums[j] >  nums[j+1]){
                    int aux = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        return nums;
    }

    static int greatest_repeated(int[] nums){
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[nums.length - 2] == nums[i]){
                count++;
            }
        }

        if(count == nums.length){
            return count = 0;
        }

        return count;
    }

    public static void main(String[] args){

        //Cria arrays de tamanhos dinâmicos.
        int[] nums = createArray();

        //Verifica se tem apenas um elemento.
        if(nums.length == 1){
            System.out.println("Não existe segundo maior");
            return;
        }

        //Ordenação sem .sort()
        nums = sort(nums);

        //Verifica repetidos.
        int count = greatest_repeated(nums);

        if(count == 0){
            System.out.println("Não existe segundo maior");
        }
        else{
            System.out.print("Segundo maior: "+ nums[nums.length - 1 - count]);
        }
    }
}
