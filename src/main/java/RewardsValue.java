public class RewardValue {
    // Member variables
    private double cashValue; // For travel expenses
    private double milesValue; // For distance in miles

    public static double conversionRate = 0.0035;


    // Constructor to initialize cash value

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    // constructor
    public RewardValue(int milesValue) {
        this.cashValue = cashValue;
    }
    private static double cashToMiles(double cashValue){
        return (double) (cashValue / conversionRate);

    }
    private static double milestoCash(double milesValue){
        return (double) (milesValue * conversionRate);

    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return cashToMiles(this.cashValue);
    }
}
