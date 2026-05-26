import java.util.Scanner;

public class Task_5 {
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	    int num, divisor = 0;
	    
		System.out.println("Digite um numero:");
		num = scanner.nextInt();
		for(int i = 1; i <= num; i++){
		    if(num%i == 0){
		        divisor++;
		    }
		}
		if(divisor == 2){
		    System.out.println("Primo");
		}
		else{
		    System.out.println("Não Primo");
		}
		scanner.close();
	}
}
