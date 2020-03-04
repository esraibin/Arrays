package OneDimentionalArrays;

public class FirstArray {
    public static void main(String[] args) {
        String[] cities ={"New York", "Seattle", "San Diego","Boulder", "Ann Arbor"};

        for (int i = 0; i <cities.length ; i++) {
            // Same order
            System.out.println(cities[i]);

        }
        System.out.println("--------------");

        for (int i = cities.length-1; i>=0 ; i--) {
            /// print reversed
            System.out.println(cities[i]);
        }
    }
}
