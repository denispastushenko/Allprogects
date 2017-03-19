package bank;

public class Bank {
    private String bankName;

    public Bank(String userName) {
        this.bankName = userName;
    }

    public String getUserName() {
        return bankName;
    }

    public void setUserName(String userName) {
        this.bankName = userName;
    }
    class Account {
        private String userName;
        private int id;
        private double balance;

        public Account(double balance, String userName) {
            this.userName = userName;
            this.balance = balance;
            id++;
        }

        public String getUserName() {
            return userName;
        }

        void deposit(double moneyAmount){
            this.balance += moneyAmount;
        }

        void withdraw(double moneyAmount){

            if (balance > 0 && balance >= moneyAmount){
                this.balance -= moneyAmount;
            }else {
                System.out.println("Your are out of funds");
            }
        }

        void showCurrentBallance(){
            System.out.println(getUserName() +
                    "\nYour balance is " + balance +
                    "\nBank name is "+ bankName +
            "\nYour id is " + id);
        }
    }
}
