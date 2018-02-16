/**
 * A Student java class for HW3 CS1331
 * @author mfrankel8
 * @version 1.0
**/

public class Student {
    private BuzzCard card;
    private String name;
    private int id;


    public Student(BuzzCard card, String name, int id) {
        this.card = card;
        this.name = name;
        this.id = id;
    }

    public BuzzCard getBuzzCard() {
        return card;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

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

    public String toString() {
        return String.format("Student named %s"
        + " with ID: %s %s", name, id, card.toString());
    }
}