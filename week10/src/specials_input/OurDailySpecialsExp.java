package specials_input;

import java.util.Scanner;

public class OurDailySpecialsExp {
    public static void main(String[] args) {

        String specials;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();
        String coffee = null;
        double price = 0;
        double total;
        double qty;
        double discount = 0;

        boolean weekend;


        while (weekend = true) {

            switch (specials) {
                case "Monday" -> {
                    weekend = false;
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                }
                case "Tuesday" -> {
                    weekend = false;
                    coffee = "Frap";
                    price = 5.95;
                    System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                }
                case "Wednesday" -> {
                    weekend = false;
                    coffee = "Cappucino";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                }
                case "Thursday" -> {
                    weekend = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                }
                case "Friday" -> {
                    weekend = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                }
                case "Saturday", "Sunday" -> {
                    weekend = true;
                    System.out.println("Please enter a weekday, not weekend!");

                }
            }
            if (weekend == true) {
                specials = input.next();
            } else {
                break;

            }

            }
        System.out.println("How many " + coffee + "s would you like to order?");
        qty = input.nextDouble();


            total = (price * qty);
            if (qty == 0) {
                System.out.println("Looks like you don't like " + coffee + "s. So sad!");
            } else if(qty <= 4) {
                System.out.println("Your total is $" + total);
            } else if(qty >= 5 && qty < 10){
                discount=total*0.1;
                total= total - discount;
                System.out.println("You qualify for a group discount! Your total is $" + total);
            } else if (qty >= 10){
                discount=total*0.2;
                total= total - discount;
                System.out.println("You qualify for a bigger group discount! Your total is $" + total);
            }

        }


    }


