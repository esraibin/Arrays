package StringBuilder;

public class Second {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Camera");
        StringBuilder strReverse = new StringBuilder(str.reverse().toString());
        System.out.println(strReverse);
        if(str.equals(strReverse)){
            System.out.println("They are same");
        }else{
            System.out.println("They are not same");
        }
        System.out.println(str.capacity());
        str.append("This is new String just added");
        System.out.println(str);
        System.out.println(str.capacity());
        str.append("This is another String just added");
        System.out.println(str);
        System.out.println(str.capacity());
    }
}
