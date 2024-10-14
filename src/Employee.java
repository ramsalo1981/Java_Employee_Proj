
enum Gender  {Male, Female};
public abstract class Employee {
    protected String Name;
    protected int SSN;
    protected String Address;
    Gender Sex;

    public Employee() {
    }

    public Employee(String name, int SSN, String address, Gender sex) {
        Name = name;
        this.SSN = SSN;
        Address = address;
        Sex = sex;
    }

    public Gender getSex() {
        return Sex;
    }

    public void setSex(Gender sex) {
        Sex = sex;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public int getSSN() {
        return SSN;
    }

    public String getAddress() {
        return Address;
    }

    public abstract double Earning();

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", SSN=" + SSN +
                ", Address='" + Address + '\'' +
                ", Sex=" + Sex +
                '}';
    }
}
