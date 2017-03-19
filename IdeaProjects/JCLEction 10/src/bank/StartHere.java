package bank;

public class StartHere {
    public static void main(String[] args) {
        Bank privat = new Bank("Privat");
        Bank.Account ivansMoney = privat.new Account(500.0, "Ivan Kupriy");
        ivansMoney.deposit(250.00);
        ivansMoney.withdraw(1000.00);
        ivansMoney.showCurrentBallance();
    }
}
