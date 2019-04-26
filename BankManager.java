import java.util.*;
class BankAccount{
    public int Balance;
    public  String Name;
    public  String Account;
}
class SavingsAccount extends BankAccount{
    int Withdraw;
}
class CurrentAccount extends BankAccount{
    int Limit;
}
class Cod extends BankAccount{
    Date expirey;
}

public class BankManager {
    public static void main(String[] args){

    }
}
