package Constructor.March16;

public class ElectricBillTest {
    public static void main(String[] args) {
        ElectricBill myBill = new ElectricBill(98765,0,"veteran",0);
        System.out.println(myBill.toString());
        myBill.addConsumption(100);
        myBill.readCounter();
        myBill.displayBill();
        myBill.addConsumption(33);
        myBill.readCounter();
    }

}
