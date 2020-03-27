package Constructor;

public class SampleTest {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println("s1:"+s1.a);
        Sample s2 = new Sample();
        System.out.println("s2:"+s2.a);
        Sample s3 = new Sample(8,0);
        System.out.println("s3:"+s3.a);
        Sample s4 = new Sample(55,6);
        System.out.println("s4:"+s4.a);


    }
}
