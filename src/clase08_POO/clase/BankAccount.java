package clase08_POO.clase;

public class BankAccount {

    // Atributo
    double balance;

    // Constuctor
    public BankAccount(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else  {
            this.balance = 0;
        }
    }

    // Metodo para sumar el saldo
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Depositado: $" + amount + ". Nuevo saldo: $" + this.balance);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0.");
        }
    }
}
