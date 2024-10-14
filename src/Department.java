import java.util.ArrayList;

public class Department {
    private int DepNumber;
    private String DepName;
    ArrayList<Employee> EmpList;

    public Department() {
    }

    public Department(int depNumber, String depName) {
        DepNumber = depNumber;
        DepName = depName;
        EmpList = new ArrayList<>();
    }

    public int getDepNumber() {
        return DepNumber;
    }

    public void setDepNumber(int depNumber) {
        DepNumber = depNumber;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String depName) {
        DepName = depName;
    }

    public ArrayList<Employee> getEmpList() {
        return EmpList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        EmpList = empList;
    }

    public void Add_Employee(Employee e){
        EmpList.add(e);
    }
    public void Remove_Employee(int index){
        EmpList.remove(index);
    }
    public int GetEmployeeCount(){
        return EmpList.size();
    }

    public void Print_Basic_Data(){
        for (Employee employee : EmpList) {
            System.out.println(employee.getSSN() + " " + employee.getName() + " " +
                    employee.getAddress() + " " + employee.getSex());

        }
        /*for (int i = 0, empListSize = EmpList.size(); i < empListSize; i++) {
            Employee employee = EmpList.get(i);
            System.out.println(employee.getSSN() + " " + employee.getName() + " " +
                    employee.getAddress() + " " + employee.getSex());

        }*/
    }

    public void Print_All_Details(){
         /*for (int i = 0; i < EmpList.size(); i++) {
            if(EmpList.get(i) instanceof SalariedEmployee)
                ((SalariedEmployee)EmpList.get(i)).DisplayAllDetails();
            if(EmpList.get(i) instanceof HourlyEmployee)
                ((HourlyEmployee)EmpList.get(i)).DisplayAllDetails();
            if(EmpList.get(i) instanceof CommissionEmployee)
                ((CommissionEmployee)EmpList.get(i)).DisplayAllDetails();

        }*/
        for (Employee employee : EmpList) {
            if (employee instanceof SalariedEmployee)
                ((SalariedEmployee) employee).DisplayAllDetails();
            if (employee instanceof HourlyEmployee)
                ((HourlyEmployee) employee).DisplayAllDetails();
            if (employee instanceof CommissionEmployee)
                ((CommissionEmployee) employee).DisplayAllDetails();

        }
    }
}
