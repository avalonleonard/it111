import java.util.Scanner;

public class ourdailyspecials {
    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();


        String coffee = null;
        double price = 0;
        double total;
        double qty;


        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();

        }

        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
            }
            case "Tuesday" -> {
                coffee = "Frap";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
            }
            case "Wednesday" -> {
                coffee = "Cappucino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is $" + coffee + " and the price will be $" + price);
            }

        }
        System.out.println("How many " + coffee + "s would you like to order?");
        qty = input.nextDouble();

        total = (price * qty);
        if (qty == 0) {
            System.out.println("Looks like you don't like " + coffee + "s. So sad!");
        }
        else {
            System.out.println("Your total is $" +total);
        }
    }
}

