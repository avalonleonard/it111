public class GallonsToLiters {
    public static void main(String args[]) {
        // gal = (3.79 * lit)

        double gal;
        double lit;
        int counter = 4;
        for(gal = 1; gal <= 100; gal = gal +4) {
            lit = (3.79 * gal);
            if(gal == 1 && lit == 3.79) {
                System.out.println(lit + " Liters =" +gal+ " Gallon");}
            else {
                System.out.println(lit + " Liters =" +gal+ " Gallons");
            }
        } //end for loop
        System.out.println("All Done!");
    }
}