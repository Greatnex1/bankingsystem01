import java.util.ArrayList;

public class Account {
    private String accountName;
    private String uuid;
    private  User user;
    private ArrayList<Transaction>transactions;

    public Account(String name,User holder, Bank theBank){
        this.user = holder;
        this.accountName = name;
this.uuid = theBank.getNewAccountUUID();

this.transactions = new ArrayList<Transaction>();

    }

    public String getUUID() {
        return this.uuid;
    }
}
