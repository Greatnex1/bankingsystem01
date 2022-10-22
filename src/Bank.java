import exception.NoUserFoundException;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;
    private ArrayList<User> users;
    private ArrayList<Account> accounts;

   public Bank(){}

    public Bank(String name){
       this.name = name;
       this.users = new ArrayList<>();
       this.accounts = new ArrayList<>();
    }


    public String getNewUserUUID() {
        String uuid;
        Random rand = new Random();
        int len = 9;
        boolean nonUnique;
        do {
            uuid = "";
            for (int i = 0; i < len; i++) {
                uuid += ((Integer) rand.nextInt(10)).toString();

            }
            //check if number is unique
            nonUnique = false;
            for (User user : this.users
            ) {
                if (uuid.compareTo(user.getUUID()) == 0) {
                    nonUnique = true;
                    break;
                }

            }

        }
        while (nonUnique);
        return uuid;
    }

    public String getNewAccountUUID() {
        String uuid;
        Random rand = new Random();
        int len = 9;
        boolean nonUnique;
        do {
            uuid = "";
            for (int i = 0; i < len; i++) {
                uuid += ((Integer) rand.nextInt(10)).toString();

            }
            //check if number is unique
            nonUnique = false;
            for (Account account : this.accounts
            ) {
                if (uuid.compareTo(account.getUUID()) == 0) {
                    nonUnique = true;
                    break;
                }

            }

        }
        while (nonUnique);
        return uuid;
    }


        public void addAccount (Account account){
            this.accounts.add(account);

        }

        public User addUser (String firstName, String lastName, String pin){
            User newUser = new User(firstName, lastName, pin, this);
            this.users.add(newUser);
            Account newAccount = new Account("Savings Account", newUser, this);

            //add holder to user and account lists
            newUser.addAccount(newAccount);
            this.addAccount(newAccount);
            return newUser;
        }

    public User userLogin(String userId, String pin) throws NoUserFoundException {
        //list of users
        for (User user : this.users) {
            if (user.getUUID().compareTo(userId) == 0 && user.validatePin(pin)) {
                return user;
            }


        }
      throw new   NoUserFoundException("this user does not exist ");
    }

public  String getName(){
       return this.name;
}
}






