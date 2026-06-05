package Task_26;

public class BanckAccount {
    private double balance;
    
    public BanckAccount(double initialBalance){
        balance = initialBalance;
        System.out.println("Conta Bancária criada");
    }

    public void setDeposit(double amount){
        balance += amount;
        System.out.println("Deposito de R$ " + amount + " realizado");
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Saque de R$ " + amount + " realizado");
        }
        else{
            System.out.println("Saldo insuficiente para saque de R$ " + amount);
        }
    }

    public void getBalance(){
        System.out.println("Saldo: R$ " + balance + '\n');
    }
}
