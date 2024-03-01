package day6.classes;

import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Optional;


public class Statistics{
  public static void highestPopulatedCityOfEachCountry(Map<String, Country> allCountries,Map<Integer, City> allCities){
      allCountries.values().stream()
        .forEach(country -> {
            allCities.values().stream()
                .filter(city -> city.getCountryCode() == country.getCode())
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(maxCity -> {
                    System.out.println("Country: " + country.getName() + ", Max Populated City: " + maxCity.getName());
                });
        });
  }
  
  public static void mostPopulatedCityOfEachContinent(Map<String, Country> allCountries, Map<Integer, City> allCities) {
    Map<String, City> maxCityPerContinent = new HashMap<>();
    
    allCountries.values().stream()
        .forEach(country -> {
            String continent = country.getContinent();
            allCities.values().stream()
                .filter(city -> allCountries.get(city.getCountryCode()).getContinent().equals(continent))
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(maxCity -> {
                    maxCityPerContinent.put(continent, maxCity);
                });
        });
    
    maxCityPerContinent.forEach((continent, maxCity) -> {
        System.out.println("Continent: " + continent + ", Most Populated City: " + maxCity.getName());
    });
}

    



public static void highestPopulatedCapitalCity(Map<String, Country> allCountries, Map<Integer, City> allCities) {
    Optional<City> maxPopulatedCapitalOptional = allCountries.values().stream()
        .map(country -> allCities.get(country.getCapital()))
        .filter(capitalCity -> capitalCity != null)
        .max(Comparator.comparingInt(City::getPopulation));

    if (maxPopulatedCapitalOptional.isPresent()) {
        City maxPopulatedCapital = maxPopulatedCapitalOptional.get();
        System.out.println("Max Populated Capital: " + maxPopulatedCapital.getName());
    } else {
        System.out.println("No capital cities found");
    }
}

}



