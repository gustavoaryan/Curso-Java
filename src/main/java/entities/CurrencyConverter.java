package entities;

public class CurrencyConverter {

    public static double IOF = 0.38;
    public static double dollarToReal(double amount, double dollarPrice){
        return amount * dollarPrice * (1.0 + IOF);
    }
}
