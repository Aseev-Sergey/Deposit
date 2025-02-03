package bank.courseproject.classes;

public class Currency extends Entity {
    private char sign;
    private double balance;

    public Currency(DataBase.Valuta valuta, double balance) {
        super(valuta.name());
        this.sign = valuta.getSymbol();
        this.balance = balance;
    }

    public char getSign() {
        return sign;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", sign, balance);
    }

}
