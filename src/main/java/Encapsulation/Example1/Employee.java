package Encapsulation.Example1;
//- Leidzia kontroliuoti duomenu prieinamuma
//- Leidzia prideti papildomos logikos,kurios nematys vartotojas
//- Pagerina programos kodo skaitomuma

public class Employee {
    private int ssn; // asmens kodas
    private String employeeName;
    private int employeeAge;

    public Employee (){
    }

    public Employee(int ssn, String employeeName, int employeeAge) {
        this.ssn = ssn;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }

    public int getSsn () {
        return ssn;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public int getEmployeeAge(){
        return employeeAge;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setEmployeeAge(int employeeAge) {
        if (employeeAge > 18){
            this.employeeAge = employeeAge;
    }
}}
