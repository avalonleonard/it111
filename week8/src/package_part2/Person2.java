package package_part2;

public class Person2 { String name;
    char gender;
    int age;
    int car;
    boolean violations;
    double creditScore;

    public void display(){
        System.out.println("Your Name: " +name);
        System.out.println("Your Age: " +age);
        System.out.println("Your Gender: " +gender);
        System.out.println("Your Car: " +car);
        System.out.println("Your Violations: " +violations);
        System.out.println("Your Credit Score: " +creditScore);

    }

    public double getRate(double monthlyRate){
        if(violations == true && creditScore<=700) {
            monthlyRate = 500;
        } else {
            monthlyRate= 100;
        }
        return monthlyRate;
    }
    public double assumeGender(double adjustedRate){
        if(gender == 'M' && age <=25){
            adjustedRate = 100;
        } else{
            adjustedRate = 0;
        }
        return adjustedRate;
    }
    public double carYear(double carFee){
        if(car >= 2010) {
            carFee = 50;

        } else {
            carFee = 0;
        }
        return carFee;
    }
}


