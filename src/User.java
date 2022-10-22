import java.awt.desktop.SystemSleepEvent;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.UUID;
import java.security.MessageDigest;

public class User {
    private String firstName;
    private String lastName;

    private String uuid;

    private  byte pinHash[];
    private int age;

    private ArrayList<Account> accounts;
    private String gender;
    private String email;


    private String phoneNumber;
public User(String firstName, String lastName, String pin, Bank theBank){
    this.firstName = firstName;
    this.lastName = lastName;
    //Using security
    try {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        this.pinHash =  messageDigest.digest(pin.getBytes());
    } catch (NoSuchAlgorithmException e) {
        System.err.println("error, caught NoSuchAlgorithmException");
        e.printStackTrace();
        System.exit(1);
    }
    //a new unique universal identification for  the user
    this.uuid = theBank.getNewUserUUID();

    this.accounts = new ArrayList<Account>();

    System.out.printf("New user with %s, %s with ID %s created.\n", lastName, firstName,this.uuid);

}

    public void addAccount(Account account) {
    this.accounts.add(account);
    }

    public String getUUID() {
    return this.uuid;
    }
    public boolean validatePin(String validPin) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(messageDigest.digest(validPin.getBytes()), this.pinHash);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);

        }
        return false;
    }
}
