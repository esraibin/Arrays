package ReviewCollection;

import java.util.HashMap;

public class CityTemperatures {
    public static void main(String[] args) {
        HashMap<String,Integer> cityTemp = new HashMap<>();
        cityTemp.put("Los Angeles",85);
        cityTemp.put("Chicago",30);
        cityTemp.put("Denver",55);
        cityTemp.put("Orlonda",90);

        int average =0;
        for (int degree: cityTemp.values()) {
            average+=degree;
        }
        System.out.println("Average temperature : "+(average/cityTemp.size()));
    }
}
