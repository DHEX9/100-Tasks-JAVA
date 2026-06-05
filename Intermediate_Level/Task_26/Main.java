package Task_26;

public class Main {
    public static void main(String[] args){
        BanckAccount daniel = new BanckAccount(500);
        daniel.getBalance();

        daniel.setDeposit(500);
        daniel.getBalance();

        daniel.withdraw(800);
        daniel.getBalance();

        daniel.withdraw(300);
        daniel.getBalance();
    }
}
