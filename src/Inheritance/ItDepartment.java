package Inheritance;
public class ItDepartment extends Department{
   private String skillSet;
   public ItDepartment(String employeeName,int employeeId,String position,double salary,String skillSet){
        super(employeeName,employeeId,position,salary);
        this.skillSet=skillSet;
   }
   public ItDepartment(){
       super();
       this.skillSet="Java";
   }
   public void setSkillSet(String skillSet){
       this.skillSet=skillSet;
   }
   public String getSkillSet(){
       return this.skillSet;
   }
   public void addSkilSet(String newSkillSet){
       this.skillSet=this.skillSet+" "+newSkillSet;
   }

    @Override
    public String toString() {
        return "ItDepartment{" +
                "skillSet='" + skillSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
