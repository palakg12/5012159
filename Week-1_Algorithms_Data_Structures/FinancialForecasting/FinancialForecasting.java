package FinancialForecasting;


public class FinancialForecasting {
    public double calculateFutureValue(double initialValue, double growthRate, int periods) {
        // Base case: If no periods are left, return the initial value
        if (periods <= 0) {
            return initialValue;
        }
        // Recursive case: Calculate future value for the remaining periods
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();

        double initialValue = 1000.0;  // Initial investment amount
        double growthRate = 0.05;      // Growth rate of 5% per period
        int periods = 10;              // Number of periods

        double futureValue = forecasting.calculateFutureValue(initialValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods: $" + String.format("%.2f", futureValue));
    }
}

