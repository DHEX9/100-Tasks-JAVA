import java.util.ArrayList;
import java.util.Scanner;

public class Task_10 {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        int num;
        ArrayList<Integer> nums = new ArrayList<>();

        while(scanner.hasNextInt()){
            nums.add(num = scanner.nextInt());
        }
        scanner.close();

        System.out.println(nums);
    }
}
