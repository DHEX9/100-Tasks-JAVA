import java.util.Scanner;

public class Task_40 {
    static Scanner scanner = new Scanner(System.in);

    public enum Player {
        X('X'), O('O');

        private final char symbol;

        Player(char symbol){
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }
    }

    static Player playerTurn(Player player){
        if(player == Player.X){
            return Player.O;
        }
        return Player.X;
    }

    static char[][] initialization(){
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        return board;
    }
    static void clearScreen() {
        System.out.print("\033[2J\033[H\n\n");
        System.out.flush();
    }

    static char[][] markPosition(char[][] board, Player player){
        while(true){
            try{
                int coordinateX = scanner.nextInt();
                int coordinateY = scanner.nextInt();
                if(board[coordinateX][coordinateY] == ' '){
                    board[coordinateX][coordinateY] = player.getSymbol();
                    break;
                }
                System.out.println("Entrada inválida!");
            }
            catch(Exception e){
                System.out.println("Entrada inválida!");
                scanner.nextLine();
            }
        }
        
        return board;
    }

    static void displayBoard(char[][] board){
        clearScreen();

        System.out.println("   0   1   2");
        for(int i = 0; i < 3; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < 3; j++) {
                if(j < 2){
                    System.out.print(board[i][j] + " | ");
                }
                else{
                    System.out.print(board[i][j]);
                }
            }
            if(i < 2){
                System.out.println("\n   ---------");
            }
        }
    }

    static boolean hasWon(char[][] board, Player player){
        //Linha
        for(int i = 0; i < 3; i++){
            if(board[i][0] == player.getSymbol() && board[i][1] == player.getSymbol() && board[i][2] == player.getSymbol()){
                return true;
            }
        }

        //Coluna
        for(int i = 0; i < 3; i++){
            if(board[0][i] == player.getSymbol() && board[1][i] == player.getSymbol() && board[2][i] == player.getSymbol()){
                return true;
            }
        }
        
        //Diagonal Princinpal
        if(board[0][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][2] == player.getSymbol()){
            return true;
        }

        //Diagonal secundária
        if(board[2][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[0][2] == player.getSymbol()){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        char[][] board = initialization();
        Player player = Player.X;
        
        
        for (int i = 0; i < 9; i++) {
            
            displayBoard(board);
            System.out.println("\n\nVez do player: " + player.getSymbol());

            board = markPosition(board, player);

            if(i < 2){player = playerTurn(player); continue;} 

            if(hasWon(board, player)){
                clearScreen();
                displayBoard(board);
                System.out.println("\n\nPlayer " + player.getSymbol() + " Ganhou!");
                return;
            }

            player = playerTurn(player);
        }
        displayBoard(board);
        System.out.println("\n\nEmpate!");
        scanner.close();
    }
}