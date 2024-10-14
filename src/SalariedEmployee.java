public class SalariedEmployee extends Employee implements Displayable{
    private double Salary;
    private double Bonus;
    private double Deduction;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int SSN, String address, Gender sex,
                            double salary, double bonus, double deduction) {
        super(name, SSN, address, sex);
        Salary = salary;
        Bonus = bonus;
        Deduction = deduction;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public double getDeduction() {
        return Deduction;
    }

    public void setDeduction(double deduction) {
        Deduction = deduction;
    }



    @Override
    public double Earning() {
        return Salary + Bonus - Deduction;
    }

    @Override
    public void DisplayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void DisplayEarning() {
        System.out.printf("Employee Earning: %.2f\n",Earning());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "Salary=" + Salary +
                ", Bonus=" + Bonus +
                ", Deduction=" + Deduction +
                '}';
    }
}
