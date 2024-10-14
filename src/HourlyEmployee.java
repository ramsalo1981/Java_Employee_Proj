public class HourlyEmployee extends Employee implements Displayable{
    private double Hour_Rate;
    private int Number_Of_Hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int SSN, String address,
                          Gender sex, double hour_Rate, int number_Of_Hours) {
        super(name, SSN, address, sex);
        Hour_Rate = hour_Rate;
        Number_Of_Hours = number_Of_Hours;
    }

    public double getHour_Rate() {
        return Hour_Rate;
    }

    public void setHour_Rate(double hour_Rate) {
        Hour_Rate = hour_Rate;
    }

    public int getNumber_Of_Hours() {
        return Number_Of_Hours;
    }

    public void setNumber_Of_Hours(int number_Of_Hours) {
        Number_Of_Hours = number_Of_Hours;
    }

    @Override
    public double Earning() {
        return Hour_Rate * Number_Of_Hours;
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
        return "HourlyEmployee{" +
                "Hour_Rate=" + Hour_Rate +
                ", Number_Of_Hours=" + Number_Of_Hours +
                '}';
    }
}
