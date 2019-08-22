class Account{
    String name;
    protected double balance;

    Account(String str, double amt){
        name=str;
        balance=amt;
    }

    String getName() {
        return name;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amt) {
        balance+=amt;
        System.out.println("Depositing :"+amt);
    }

    void withdraw(double amt) {
        balance-=amt;
        System.out.println("Withdrawing: "+amt);
    }
}

class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(String str, double amt, double rate){
        super(str, amt);
        interestRate=rate;
    }
}

class CheckingAccount extends Account {
    double overdraft;
    CheckingAccount(String str, double amt){
        super(str, amt);
    }

    CheckingAccount(String str, double amt, double draft){
        super(str, amt);
        overdraft=draft;
    }

    void withdraw(double amt){
        System.out.println("Overdraft Amount: "+ overdraft);
        if(amt<=balance){
            balance-=amt;
            System.out.println("Withdrawing :" +amt);
        }

        else if((amt>balance) && (amt>(balance+overdraft))) {
            System.out.println("Sorry! You cannot withdraw");
        }

        else{
            double result = amt-balance;
            overdraft-=result;
            balance=0;

            System.out.println("Withdrawing: "+amt);
            System.out.println("Current Overdraft Amount: "+overdraft);
        }
    }
}

class AccountTest{
    public static void main(String[] args){
        Account sAccountObj = new SavingsAccount("John", 500, 4);
        System.out.println("\nSavings Account details");
        System.out.println("------------------------------");
        System.out.println(" "+sAccountObj.getName()+" has an initial balance of: "+sAccountObj.getBalance());
        sAccountObj.deposit(200);
        sAccountObj.withdraw(200);                                                                                    

        System.out.println("\n Checking Account Detials");
        System.out.println("----------------------------------");

        CheckingAccount cAccountObj = new CheckingAccount("Stephen", 200, 200);
        System.out.println(" "+cAccountObj.getName() + " has an initial balance of : "+ cAccountObj.getBalance());
        cAccountObj.deposit(200);
        cAccountObj.withdraw(500);
        System.out.println(" "+cAccountObj.getName()+ "at the end of transaction has a balance of: "+cAccountObj.getBalance());
    }
}