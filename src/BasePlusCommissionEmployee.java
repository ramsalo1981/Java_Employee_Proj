public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double base;

    public BasePlusCommissionEmployee(String name, int SSN, String address, Gender sex,
                                      double gross_Sales, double commission_rate, double base) {
        super(name, SSN, address, sex, gross_Sales, commission_rate);
        this.base = base;
    }

    public BasePlusCommissionEmployee() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double Earning() {
        return base + super.Earning();
    }

    @Override
    public void DisplayAllDetails() {
        super.DisplayAllDetails();
        DisplayEarning();
    }

    @Override
    public void DisplayEarning() {
        System.out.printf("Employee Earning: %.2f\n",Earning());
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "base=" + base +
                '}';
    }
}
