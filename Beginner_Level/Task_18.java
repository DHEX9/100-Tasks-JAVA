import java.util.Scanner;

public class Task_18 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(){
        System.out.println("Entre com valores para a média:");

        String[] nums = scanner.nextLine().trim().split("\\s+");
        double average = 0, counter = 0;
        scanner.close();
        
        for(int i = 0; i < nums.length; i++){
            average += Double.parseDouble(nums[i]);
            counter++;
        }
        System.out.println("Media: " + average/counter);
    }
}
