package package_person;

public class PersonDetails {
    //this file will have a main method
    public static void main(String[] args){
        Person firstPerson;
        Person secondPerson;

        firstPerson = new Person();
        secondPerson = new Person();

        firstPerson.name= "Cathy";
        firstPerson.gender= 'F';
        firstPerson.age = 33;
        firstPerson.car = "Volkswagen Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name= "Kendall";
       secondPerson.gender= 'M';
       secondPerson.age = 22;
        secondPerson.car = "Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

double monthlyRate = 0;
double adjustedRate = 0;


        firstPerson.display();

        System.out.println("Preliminary rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate)+ " dollars");
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate)+ "dollars");
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate)+ " dollars");
        System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate)+ "dollars");



    }
}
