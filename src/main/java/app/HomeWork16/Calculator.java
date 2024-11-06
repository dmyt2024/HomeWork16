package app.HomeWork16;

public class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {

        if (b == 0) {
            System.out.println("Помилка! Не можна ділити на нуль!");
            ;
            return Double.NaN;
        } else {
            return a / b;
        }

    }
}

