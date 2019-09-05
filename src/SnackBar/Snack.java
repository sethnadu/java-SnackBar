package snackbar;

public class Snack 
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingid;

    public Snack(String name, int quantity, double cost, int vendingid)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingid = vendingid;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost(int quantity)
    {
        return quantity * cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }

    public int getVendingid()
    {
        return vendingid;
    }

    public void setVendingid(int vendingid)
    {
        this.vendingid = vendingid;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
    }

    // public double getTotalCost()
    // {
    //     return 
    // }


}