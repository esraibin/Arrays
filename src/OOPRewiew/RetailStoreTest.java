package OOPRewiew;

public class RetailStoreTest {
    public static void main(String[] args) {
        RetailStore store1 = new RetailStore("cookies",200);
        RetailStore  store2 = new RetailStore("bread",35);
        store1.showQuantity();
        store2.showQuantity();
        RetailStore.showTotalQuantity();
        store1.receive(300);
        store2.receive(600);
        //Java will execute body of the if this method
        store1.showQuantity();
        store2.showQuantity();
        RetailStore.showTotalQuantity();
    }
}
