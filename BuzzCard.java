/**
 * A BuzzCard java class
 * @author mfrankel8
 * @version 1.0
**/

public class BuzzCard {

    private int mealSwipes;
    private double diningDollars;
    private double buzzFunds;

    public BuzzCard (int mealSwipes, double diningDollars, double buzzFunds) {
        this.mealSwipes = mealSwipes;
        this.diningDollars = diningDollars;
        this.buzzFunds = buzzFunds;
    }

    public String toString() {
        return String.format("Buzzcard balance with Dining Dollars: %s," +
            " BuzzFunds: %s, Meal Swipes: %s",
            diningDollars, buzzFunds, mealSwipes);
    }

    public void setMealSwipes(int mealSwipes) {
       this.mealSwipes = mealSwipes;
    }

    public int getMealSwipes() {
       return mealSwipes;
    }

    public void setDiningDollars(double diningDollars) {
       this.diningDollars = diningDollars;
    }

    public double getDiningDollars() {
       return diningDollars;
    }

    public void setBuzzFunds(double buzzFunds) {
       this.buzzFunds = buzzFunds;
    }

    public double getBuzzFunds() {
       return buzzFunds;
    }

}