public class Account {
    private Integer id;
    private long balance;

    public Account(int id) {
        this.id = id;
        this.balance = 0;
    }
    public void deposit(long amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    public void withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        }
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
}