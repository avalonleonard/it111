package package_part2;

public class PersonDetailsHW {public static void main(String[] args){
    Person2 firstPerson;
    Person2 secondPerson;

    firstPerson = new Person2();
    secondPerson = new Person2();

    firstPerson.name= "Cathy";
    firstPerson.gender= 'F';
    firstPerson.age = 33;
    firstPerson.car = 2010;
    firstPerson.violations = false;
    firstPerson.creditScore = 690;

    secondPerson.name= "Kendall";
    secondPerson.gender= 'M';
    secondPerson.age = 22;
    secondPerson.car = 2019;
    secondPerson.violations = true;
    secondPerson.creditScore = 670;

    double monthlyRate = 0;
    double adjustedRate = 0;
    double carFee = 0;


    firstPerson.display();


    System.out.println("Preliminary rate: " +firstPerson.getRate(monthlyRate)+ " dollars");
    System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate)+ " dollars");
    System.out.println("New Car Adjustment: " +firstPerson.carYear(carFee)+ " dollars");
    System.out.print("Total monthly premium: ");
    System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.carYear(carFee)+ " dollars");
    System.out.println();

    secondPerson.display();

    System.out.println("Preliminary rate: " +secondPerson.getRate(monthlyRate)+ " dollars");
    System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate)+ " dollars");
    System.out.println("New Car Adjustment: " +secondPerson.carYear(carFee)+ " dollars");
    System.out.print("Total monthly premium: ");
    System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.carYear(carFee)+ " dollars");




}
}


