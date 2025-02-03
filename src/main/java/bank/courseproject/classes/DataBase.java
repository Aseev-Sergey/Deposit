package bank.courseproject.classes;

import java.util.Map;

public final class DataBase {
    protected enum Valuta{
        RUBLE('₽'),
        DOLLAR('$'),
        EURO('€');

        private final char symbol;

        Valuta(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }
    }

    protected static final Map<Integer, Double> TERMS_AND_RATES = Map.of(
            0, 0.1,       // Бессрочный вклад
            3, 1.0,
            6, 2.0,
            12, 3.0,
            18, 4.0
    );

    public double getInterestRate(int termInMonths) {
        return TERMS_AND_RATES.getOrDefault(termInMonths, 0.0); // Возвращаем 0%, если срок не найден
    }


}
