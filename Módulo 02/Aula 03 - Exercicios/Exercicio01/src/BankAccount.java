public class BankAccount {
  private String holderName;
  private String accountNumber;
  private Double balance = 0.00;

  public BankAccount(String holderName, String accountNumber, Double balance) {
    this.holderName = holderName;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public String getHolderName() {
    return holderName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public Double getBalance() {
    return balance;
  }

  public void deposit(Double amount) {
    this.balance += amount;
  }

  public boolean withdraw(Double amount) {
    if (amount > balance) {
      return false;
    } else {
      this.balance -= amount;
      return true;
    }
  }
}
