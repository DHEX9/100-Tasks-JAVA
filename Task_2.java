import java.util.Scanner;

public class Task_2 {
    static Scanner scanner = new Scanner(System.in);

    // Função para entrada de dados
    static int entrada(){

        //Roda até retornar um numero válido
        while(true){
            try{
                System.out.println("Digite um número:");
                return scanner.nextInt();

                
            } catch (Exception e) {
                System.out.println("Isso não é um número.");
                scanner.next(); // Limpa entrada inválida
            }
        }
    }

    //Verifica se o usuário quer testar outro número
    static boolean again(){

        scanner.nextLine(); //Limpar o buffer

        System.out.println("Again?(y/...)");
        return scanner.nextLine().equalsIgnoreCase("y"); //True se entrada for igual a y
    }

    public static void main(String[] args) {

        do{
            //Par caso o resto da divisão por 2 for 0.
            if(entrada()%2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }

            }while(again());
        
        scanner.close();
    }   
}
