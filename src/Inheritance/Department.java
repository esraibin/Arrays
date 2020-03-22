package Inheritance;

public class Department {
    protected String employeeName;
    protected int employeeId;
    protected String position;
    protected double salary;

    public Department(){
        this.employeeName="Temp";
        this.employeeId= 999;
        this.position="intern";
        this.salary= 1000;

    }

    public Department(String employeeName, int employeeId,String position,double salary){
        this.employeeName=employeeName;
        this.employeeId= employeeId;
        this.position= position;
        this.salary=salary;

    }public String changePosition(){
        return "new position";

    }
    public void riseSalary(){
        salary += 500;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
