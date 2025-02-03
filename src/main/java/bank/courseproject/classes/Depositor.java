package bank.courseproject.classes;

public class Depositor extends Person{
    private Deposit deposit;

    public Depositor() {
    }

    public Depositor(String surname, String name, String patronymic, Deposit deposit) {
        super(surname, name, patronymic);
        this.deposit = deposit;
    }
}
