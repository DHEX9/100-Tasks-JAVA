import java.util.Scanner;

public class Task_12 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int num, num2;
        int div = 2, mmc = 1, mdc = 1;
        System.out.println("Entre com dois valores:");
        num = scanner.nextInt(); num2 = scanner.nextInt();
        scanner.close();

        while((num != 1) || (num2 != 1)){
            
            if(num%div == 0 || num2%div == 0){
                System.out.println(div + " | " + num + " " + num2);

                mmc *= div;

                if(num%div == 0 && num2%div == 0){
                    mdc *= div;
                }
                
                if(num%div == 0){
                    num /= div;
                }
   
                if(num2%div == 0){
                    num2 /= div;
                }   
           }
           else{
                div++;
            }
        }
        System.out.println("  | " + num + " " + num2);
        System.out.println("MDC: "+ mdc + ", MMC: " + mmc);
    }
}
