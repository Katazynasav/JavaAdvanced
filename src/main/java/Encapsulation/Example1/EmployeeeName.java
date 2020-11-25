package Encapsulation.Example1;

public class EmployeeeName {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSsn(123451);
        employee.setEmployeeAge(25);
        employee.setEmployeeName("Maria");
        System.out.println("Darbotojo vardas: " + employee.getEmployeeName());
        System.out.println("Darbotojo amzius " + employee.getEmployeeAge());
        System.out.println("Darbotojo ID: " + employee.getSsn());
        System.out.println("=============================");


        Employee secondEmployee = new Employee(223765,"Jonas",30);
        System.out.println("Darbotojo vardas: " + secondEmployee.getEmployeeName());
        System.out.println("Darbotojo amzius " + secondEmployee.getEmployeeAge());
        System.out.println("Darbotojo ID: " + secondEmployee.getSsn());

    }
}
