package InterviewPrep;

public class Fionacci {
    public static void main(String[] args) {
        for (int i = 0; i <11 ; i++) {
            System.out.println(fi(i));

        }
        int a=0;
        int c=1;
        int d;
        for (int i = 0; i <11 ; i++) {
            d=a+c;
            System.out.print(d+" ");
            a=c;
            c=d;
        }

    }

    public static int fi(int seq) {
        if(seq<=1) {
            return seq;
        }
        else{
            return fi(seq-2)+fi(seq-2);
        }
    }
}
