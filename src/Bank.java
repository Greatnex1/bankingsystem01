import java.util.ArrayList;

public class Bank extends User {

    private double balance;
    private  ArrayList<User> users;

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    private int deposit;

    public Bank(String firstname, String lastname, int age, String gender, String email, String phoneNumber) {
        super(firstname, lastname, age, gender, email, phoneNumber);
    }

    public Bank() {

    }

    public void deposit (double amount){
        if(amount <= 0){
            System.err.println("Cannot allow deposit of a negative value, Please enter a positive value");
        }
        else{
            this.balance =+ amount;
            System.out.println("Your present account balance is $" + amount);

        }
      }
public void withdraw(double amount) {
        if(this.balance >= amount){
   this.balance -= amount;
        System.out.printf("%.2f has been withdrawn" + amount);
    } else {
        balance -= amount;
        System.err.println("Insufficient funds. Check balance or deposit funds ");

    }
}

        public void viewAccountDetails(){
         viewUser();

            System.out.println("Your current balance is $" + getBalance());

        }


        public void saveUser(User user){
        users.add(user);

        }
        public int getNumberOfUsers(){
        return users.size();

        }

    public double getBalance() {
        return balance;
}
    }





