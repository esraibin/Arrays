package Inheritance;

public class DepartmentTest {
    public static void main(String[] args) {
        Department myEmp = new Department("Robin",123,"QA",95000);
        System.out.println(myEmp.toString());
        ItDepartment myIt = new ItDepartment("Mike",124,"QA",100000,"Selenium");
        System.out.println(myIt.toString());
        myIt.addSkilSet("SQL");
        System.out.println(myIt.toString());


    }
}

