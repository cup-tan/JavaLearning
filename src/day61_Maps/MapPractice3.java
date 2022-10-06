package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

/*
2. create a map that can contain the name of countries and their capitals
			at least put 5 countries and their capital city names in the map
 */
public class MapPractice3{


    public static void main(String[] args) {

        Map< String , String> countries = new LinkedHashMap<>();
        countries.put("East Turkistan", "Kashgar");
        countries.put("Uzbekistan", "Tashkent");
        countries.put("Kyrgyzstan","Bishkek");
        countries.put("Spain", "Madrid");
        countries.put("USA", "Washington");
        countries.put("Ukraine", "Kiev");
        countries.put("Azerbaijan", "Karabagh");
        countries.put("Turkey","Ankara");
        countries.put("NH", "Concord");
        countries.put("Asmara", "Eritrea");
        countries.put("Serbia","Belgrade");



        // country name is countryName, Capital city is cityName


        for( String eachCountry   :  countries.keySet()){
                    String eachCity =  countries.get(eachCountry);

            System.out.println(eachCountry+"'s capital is: "+eachCity);


        }





    }
}
