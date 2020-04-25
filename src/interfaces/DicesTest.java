package interfaces;

public class DicesTest {
    public static void main(String[] args) {
        CasinoDice myCasino = new CasinoDice();
        //System.out.println(myCasino.rollDice());
        DarkCasinoDice myDark = new DarkCasinoDice();
        System.out.println(myDark.rollDice());
    }
}
