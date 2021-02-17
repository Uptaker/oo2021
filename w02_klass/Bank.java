public class Bank {

    private boolean locked = false;
    public String name;
    public int balance;

    public Bank(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getBalance() {
        if (this.locked) {
            return "Your account is locked!";
        }
        return name + " total balance is: " + balance;
    }

    public String transfer(int value) {
        if (this.locked) {
            return "Your account is locked!";
        }
        this.balance = this.balance + value;
        return "TRANSFER: " + this.name + " account balance is now: " + this.balance;
    }

    public String withdraw(int value) {
        if (this.locked) {
            return "Your account is locked!";
        }
        if (value > this.balance) {
            return "You don't have enough funds to transfer that amount!";
        } else {
            this.balance = this.balance - value;
            return "WITHDRAW: " + this.name + " account balance is now: " + this.balance;
        }
    }

    public String send(Bank receiver, int value) {
        if (this.locked) {
            return "Your account is locked!";
        }
        if (value > this.balance) {
            return "You don't have enough funds to send that amount!";
        } else {
            this.balance = this.balance - value;
            receiver.transfer(value);
            return "You sent " + value + " to " + receiver.name;
        }
    }

    // admins?
    public String setLock(boolean value) {
        this.locked = value;
        if (value == true) {
            return "ADMIN: " + this.name + " account is now locked";
        } else {
            return "ADMIN: " + this.name + " account is now unlocked";
        }
    }
}
