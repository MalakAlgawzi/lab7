public class SavingAccount {

        private double balance;
        private int interest;

        public double getBalance() {
            return balance;
        }

        public SavingAccount(double balance, int interest) {
            this.balance = balance;
            this.interest = interest;
        }


        public void withdraw(double amount)
        {
            balance=balance-amount;
        }
        public void deposite(double amount)
        {
            balance=balance-amount;
        }
        public void addInterest()
        {
            double invest=balance*interest/100;
            balance=balance+invest;
        }

}
