/**
 * A Student java class for HW3 CS1331
 * @author mfrankel8
 * @version 1.0
**/

public class Student {
    private BuzzCard card;
    private String name;
    private int id;

    /**
     * Student constructor method
     * @param card A BuzzCard object for the student
     * @param name A name for the student as a string
     * @param id A GTID for the student as an int
     */
    public Student(BuzzCard card, String name, int id) {
        this.card = card;
        this.name = name;
        this.id = id;
    }

    /**
     * card getter method
     * @return the object's BuzzCard object
     */
    public BuzzCard getBuzzCard() {
        return card;
    }

    /**
     * name getter method
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * id getter method
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * simple function to buy a brittain item on meal swipes
     * @param item The BrittainItem you wish to buy
     */
    public void buyBrittainMealSwipes(BrittainItem item) {
        int cost = item.getMealSwipes();
        int currentSwipes = card.getMealSwipes();
        if (currentSwipes < cost) {
            System.out.println("You do not have the amount"
                + " to buy this item :(");
        } else {
            card.setMealSwipes(currentSwipes - cost);
        }
    }

    /**
     * simple function to buy a brittain item on buzz funds
     * @param item The BrittainItem you wish to buy
     */
    public void buyBrittainBuzzFunds(BrittainItem item) {
        double cost = item.getBuzzFunds();
        double currentFunds = card.getBuzzFunds();
        if (currentFunds < cost) {
            System.out.println("You do not have the amount"
                + " to buy this item :(");
        } else {
            card.setBuzzFunds(currentFunds - cost);
        }
    }

    /**
     * simple function to buy a burdells item on buzz funds
     * @param item The BurdellsItem you wish to buy
     */
    public void buyBurdellsBuzzFunds(BurdellsItem item) {
        double cost = item.getBuzzFunds();
        double currentFunds = card.getBuzzFunds();
        if (currentFunds < cost) {
            System.out.println("You do not have the amount"
                + " to buy this item :(");
        } else {
            card.setBuzzFunds(currentFunds - cost);
        }
    }

    /**
     * simple function to buy a SubwayItem item on dining dollars
     * @param item The SubwayItem you wish to buy
     */
    public void buySubwayDiningDollars(SubwayItem item) {
        double cost = item.getDiningDollars();
        double currentDiningDollars = card.getDiningDollars();
        if (currentDiningDollars < cost) {
            System.out.println("You do not have the amount"
                + " to buy this item :(");
        } else {
            card.setDiningDollars(currentDiningDollars - cost);
        }
    }

    /**
     * simple function to buy a SubwayItem item on buzz funds
     * @param item The SubwayItem you wish to buy
     */
    public void buySubwayBuzzFunds(SubwayItem item) {
        double cost = item.getBuzzFunds();
        double currentFunds = card.getBuzzFunds();
        if (currentFunds < cost) {
            System.out.println("You do not have the amount"
                + " to buy this item :(");
        } else {
            card.setBuzzFunds(currentFunds - cost);
        }
    }

    /**
     * Student toString() function
     * @return a string representation of the student
     */
    public String toString() {
        return String.format("Student named %s"
        + " with ID: %s %s", name, id, card.toString());
    }
}