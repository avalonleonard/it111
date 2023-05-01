public class MyOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // employee, wage, hours worked, overtime, the whole enchilada

int regHours, overtimeHours;
double overtimePay, regularPay, total;
float wage;
double hourlyWithOvertime;

regHours = 40;
overtimeHours = 5;
wage = 25.50F;
regularPay = regHours * wage;
overtimePay = (wage * 1.5) * overtimeHours;
total  = overtimePay +regularPay;
hourlyWithOvertime = total / (regHours + overtimeHours);
        System.out.println("Regular pay: $" +regularPay+ " dollars");
        System.out.println("Overtime pay: $" +overtimePay+ " dollars");
        System.out.println("Total pay: $" +total+ " dollars");
        //System.out.println("Hourly rate with overtime: $" +hourlyWithOvertime+ " dollars");
        System.out.print("Hourly rate with overtime:");
        System.out.printf("$%.2f", hourlyWithOvertime);


    }
}
