package snackbar;

public class Main
{
    public static void main(String[] args)
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, 0);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 0);
        Snack s3 = new Snack("Pretzel", 30, 2.00, 0);
        Snack s4 = new Snack("Soda", 24, 2.50, 1);
        Snack s5 = new Snack("Water", 20, 2.75, 1);

        jane.buySnack(3, s4);
        System.out.println(jane.getName() + "'s Cash On Hand: " + jane.getCashOnHand());
        System.out.println(s4.getName() + "'s Remaining: " + s4.getQuantity());

        jane.buySnack(1, s3);
        System.out.println(jane.getName() + "'s Cash On Hand: " + jane.getCashOnHand());
        System.out.println(s3.getName() + "'s Remaining: " + s3.getQuantity());

        bob.buySnack(2, s4);
        System.out.println(bob.getName() + "'s Cash On Hand: " + bob.getCashOnHand());
        System.out.println(s4.getName() + "'s Remaining: " + s4.getQuantity());

        jane.addCash(10.00);
        System.out.println(jane.getName() + "'s Cash On Hand: " + jane.getCashOnHand());

        jane.buySnack(1, s2);
        System.out.println(jane.getName() + "'s Cash On Hand: " + jane.getCashOnHand());
        System.out.println(s2.getName() + "'s Remaining: " + s2.getQuantity());

        s3.addQuantity(12);
        System.out.println(s3.getName() + "'s Remaining: " + s3.getQuantity());

        bob.buySnack(3, s3);
        System.out.println(bob.getName() + "'s Cash On Hand: " + bob.getCashOnHand());
        System.out.println(s3.getName() + "'s Remaining: " + s3.getQuantity());

        System.out.println("Snack: " + s1.getName() + ", VendingMachine" + food.getName() + ", Remaining: " + s1.getQuantity() + ", Total Cost of Remaing: " + s1.getCost(s1.getQuantity()));
        System.out.println("Snack: " + s2.getName() + ", VendingMachine" + food.getName() + ", Remaining: " + s2.getQuantity() + ", Total Cost of Remaing: " + s2.getCost(s2.getQuantity()));
        System.out.println("Snack: " + s3.getName() + ", VendingMachine" + food.getName() + ", Remaining: " + s3.getQuantity() + ", Total Cost of Remaing: " + s3.getCost(s3.getQuantity()));
        System.out.println("Snack: " + s4.getName() + ", VendingMachine" + drink.getName() + ", Remaining: " + s4.getQuantity() + ", Total Cost of Remaing: " + s4.getCost(s4.getQuantity()));
        System.out.println("Snack: " + s5.getName() + ", VendingMachine" + drink.getName() + ", Remaining: " + s5.getQuantity() + ", Total Cost of Remaing: " + s5.getCost(s5.getQuantity()));


    }
}