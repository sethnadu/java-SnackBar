package snackbar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;



    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public void addCash(double cash)
    {
        this.cashOnHand += cash;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void buySnack(int quantity, Snack snack)
    {
        snack.buySnack(quantity);
        this.cashOnHand -= snack.getCost(quantity);
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

}