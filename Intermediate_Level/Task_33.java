import java.util.Scanner;

public class Task_33 {
    static Scanner scanner = new Scanner(System.in);

    static int[] createArray(){
        System.out.print("Entre com seu array: ");
        String[] arr_str = scanner.nextLine().trim().split("\\s+");
        int[] arr = new int[arr_str.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arr_str[i]);
        }
        return arr;
    }

    static int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length - 1;

        while(left <= right){
            
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] arr = createArray();
        System.out.println(binarySearch(arr, scanner.nextInt()));
        scanner.close();

    }
}