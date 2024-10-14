public class CommissionEmployee extends Employee implements Displayable{
   protected double Gross_Sales;
   protected double Commission_rate;

    public CommissionEmployee() {
    }

    public CommissionEmployee(String name, int SSN, String address,
                              Gender sex, double gross_Sales, double commission_rate) {
        super(name, SSN, address, sex);
        Gross_Sales = gross_Sales;
        Commission_rate = commission_rate;
    }

    @Override
    public double Earning() {
        return Gross_Sales * Commission_rate;
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
        return "CommissionEmployee{" +
                "Gross_Sales=" + Gross_Sales +
                ", Commission_rate=" + Commission_rate +
                '}';
    }
}
