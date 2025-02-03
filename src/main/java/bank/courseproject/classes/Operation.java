package bank.courseproject.classes;

public class Operation {
    public double add(double balance, double amount){
        return balance+=amount;
    }

    public double take(double balance, double amount){
        return balance-=amount;
    }
    public void close(){
        //удаление экземпляра класса Deposit или удаление строки из интерфейса?
    }
}
