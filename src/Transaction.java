import java.util.Date;

public class Transaction {
    private  double amount;

    private Date timeStamp;

    private  String memo;
    private Account account;

    public Transaction(double amount, Account account){
        this.amount = amount;
        this.account =account;
        this.timeStamp = new Date();

    }
public Transaction(double amount,String memo, Account account){
   this(amount,account);
this.memo = memo;

}
}
