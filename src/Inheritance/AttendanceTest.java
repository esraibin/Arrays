package Inheritance;

public class AttendanceTest {

    public static void main(String[] args) {
        String[] students = {"John","Jane","Ann","Mia","Maddy"};
        int[] ids = {1, 2, 3, 4, 5};
        Attendance myAtt = new Attendance(students, ids);
        myAtt.enterAttendanceToday("tue");
        myAtt.enterAttendanceToday("mon");
        myAtt.printWeeklyAttendance();
        myAtt.findMostAttended();
        myAtt.findMostAttendedDay();

    }
}
