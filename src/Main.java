//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department d1 = new Department(1,"Information System");

        SalariedEmployee s1 = new SalariedEmployee("Rami",100,"Jön",Gender.Male,
                1000,200,50);
        d1.Add_Employee(s1);

        System.out.println(d1.GetEmployeeCount());
        System.out.println("-----------------------------");
        d1.Print_Basic_Data();
        System.out.println("-----------------------------");
        d1.Print_All_Details();

    }
}