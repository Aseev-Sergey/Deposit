package bank.courseproject.classes;

public class Deposit {
    private Type type;
    private Operation operation;
    private Currency currency;
    private Bank bank;

    public Deposit() {
    }

    public Deposit(Type type, Operation operation, Currency currency, Bank bank) {
        this.type = type;
        this.operation = operation;
        this.currency = currency;
        this.bank = bank;
    }
}
