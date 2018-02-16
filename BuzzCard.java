/**
 * A BuzzCard java class
 * @author mfrankel8
 * @version 1.0
**/

public class BuzzCard {

    private int mealSwipes;
    private double dinningDollars;
    private double buzzFunds;

    public BuzzCard (int mealSwipes, double dinningDollars, double buzzFunds) {
        this.mealSwipes = mealSwipes;
        this.dinningDollars = dinningDollars;
        this.buzzFunds = buzzFunds;
    }

    public String toString() {
        return String.format("Buzzcard balance with Dining Dollars: %s," +
            " BuzzFunds: %s, Meal Swipes: %s",
            dinningDollars, buzzFunds, mealSwipes);
    }

    public void setMealSwipes(int mealSwipes) {
       this.mealSwipes = mealSwipes;
    }

    public int getMealSwipes() {
       return mealSwipes;
    }

    public void setDinningDollars(double dinningDollars) {
       this.dinningDollars = dinningDollars;
    }

    public double getDinningDollars() {
       return dinningDollars;
    }

    public void setBuzzFunds(double buzzFunds) {
       this.buzzFunds = buzzFunds;
    }

    public double getBuzzFunds() {
       return buzzFunds;
    }

}