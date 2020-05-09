package Methods;

public class printCalendar {
    public static void main(String[] args) {
        printCalendar(2019,"-");

    }
    public static void printCalendar(int year, String sperator){
        for (int i = 1; i < 13 ; i++) {
            for (int j = 1; j < 31 ; j++) {
                System.out.println(i+sperator+j+sperator+year);
            }
            System.out.println();
        }

    }
}
