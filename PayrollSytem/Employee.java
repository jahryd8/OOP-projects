package PayrollSytem;

public class Employee {
    private String trn;
    private String firstName, middleName, lastName;
    private String category; // "PT" or "FT"
    private int day, month, year;
    private double hoursWorked;

    public Employee(String trn, String first, String middle, String last, int d, int m, int y, double hours, String category) {
        this.trn = trn;
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;
        this.day = d;
        this.month = m;
        this.year = y;
        this.hoursWorked = hours;
        this.category = category;
    }

    public void display() {
        System.out.println("TRN: " + trn);
        System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Date of Employment: " + day + "/" + month + "/" + year);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Category: " + category);
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getCategory() {
        return category;
    }
}

