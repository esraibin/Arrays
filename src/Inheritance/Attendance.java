package Inheritance;
import java.util.Arrays;
public class Attendance {
    String students[];
    int studentId[];
    private int weekly[][];
    final String days[] = {"Mon", "Tue", "Wed", "Thu", "Fri"};

    public Attendance(String students[], int studentId[]) {
        this.students = students;
        this.studentId = studentId;
        int[][] weeklyEmpty = new int[5][students.length];
        this.weekly = weeklyEmpty;
    }
    public String[] getStudents(){
        return this.students;
    }
    public int[] getStudentId(){
        return this.studentId;
    }
    public int [][] getWeekly(){
        return this.weekly;
    }
    public void enterAttendanceToday(String today) {
        if (today.equalsIgnoreCase("mon")) {
            for (int i = 0; i < this.students.length; i++) {
                this.weekly[0][i] = 1;
            }
        } else if (today.equalsIgnoreCase("tue")) {
            for (int i = 0; i < this.students.length; i++) {
                this.weekly[1][i] = 1;
            }
        }
    }
    public void printWeeklyAttendance(){
        System.out.println("\t\t");
        for (String student : this.students) {
            System.out.print(student+"\t\t");
            }
        System.out.println();
        for (int i = 0; i <this.days.length ; i++) {
            System.out.print(this.days[i] + "\t\t");
            for (int j = 0; j < this.students.length; j++) {
                if (this.weekly[i][j] == 0) {
                    System.out.print("Absent\t\t");
                } else {
                    System.out.print("Present\t\t");
                }
            }
            System.out.println();
        }

    }
    private int[] findMax(int[] arr){
        // returns max,max value index
        int [] result ={0,0};
        int index=0;
        int max =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max= arr[i];
                index=1;
            }

        }
        result[0] = max;
        result[1]= index;
        return result;
    }
    public void findMostAttended(){
        int attendance[] =new int [this.students.length];
        int total;
        for (int i = 0; i <this.weekly.length ; i++) {
            total=0;
            for(int j= 0; j<this.weekly[i].length;j++){
                total += this.weekly[j][i];

            }attendance[i]= total;

        }
        int result[] = findMax(attendance);
        System.out.println("^^^^^^^^The Most Attended Student^^^^^^" +
                "\n"+this.students[result[1]]+"="+ result[0]);

    }public void findMostAttendedDay(){
        int attendance[] =new int[this.days.length];
        int total;
        for(int i=0; i<this.days.length; i++){
            total=0;
            for (int j = 0; j <this.weekly[i].length ; j++) {
                total += this.weekly[i][j];

            }
            attendance[i]=total;
        }
        int result[]= {0,0};
        result = findMax(attendance);
        System.out.println("^^^^^^Most Attended Day^^^^^"+"\n" +
                this.days[result[1]]+" = "+result[0]);

    }

    @Override
    public String toString() {
        return "Attendance{" +
                "students=" + Arrays.toString(students) +
                ", studentId=" + Arrays.toString(studentId) +
                ", weekly=" + Arrays.toString(weekly) +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}