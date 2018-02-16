/**
 * A BuzzCard java class
 * @author mfrankel8
 * @version 1.0
**/

public class BuzzCard {

    private int mealSwipes;
    private double diningDollars;
    private double buzzFunds;

    /**
     * Buzzcard constructor
     * @param mealSwipes Amount of mealswipes on card as int
     * @param diningDollars Amount of dining Dollars as double
     * @param buzzFunds Amount of buzz funds as double
     */
    public BuzzCard(int mealSwipes, double diningDollars, double buzzFunds) {
        this.mealSwipes = mealSwipes;
        this.diningDollars = diningDollars;
        this.buzzFunds = buzzFunds;
    }

    /**
     * toString function for Buzzcard
     * @return string representation of card values
     */
    public String toString() {
        return String.format("Buzzcard balance with Dining Dollars: %s,"
            + " BuzzFunds: %s, Meal Swipes: %s",
            diningDollars, buzzFunds, mealSwipes);
    }

    /**
     * mealSwipes setter method
     * @param mealSwipes New value to set meal swipes to
     */
    public void setMealSwipes(int mealSwipes) {
        this.mealSwipes = mealSwipes;
    }

    /**
     * mealSwipes getter method
     * @return current meal swipes
     */
    public int getMealSwipes() {
        return mealSwipes;
    }

    /**
     * diningDollars setter method
     * @param diningDollars New value to set dinning dollars to
     */
    public void setDiningDollars(double diningDollars) {
        this.diningDollars = diningDollars;
    }

    /**
     * diningDollars getter method
     * @return current diningDollars
     */
    public double getDiningDollars() {
        return diningDollars;
    }

    /**
     * buzzFunds setter method
     * @param buzzFunds New value to set buzz funds to
     */
    public void setBuzzFunds(double buzzFunds) {
        this.buzzFunds = buzzFunds;
    }

    /**
     * buzzFunds getter method
     * @return current buzzFunds
     */
    public double getBuzzFunds() {
        return buzzFunds;
    }

}