

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();

        // System.out.println(countryDao.getAllContinents().stream()
        // .map(continent->countryDao.findCountriesByContinent(continent)
        // .stream().map(country->country.getCities().stream()
        // .map(city->city.getPopulation()).
        // max(Integer::compare).orElse(0)).collect(Collectors.toList())).collect(Collectors.toList()));

        System.out.println(countryDao.getAllContinents().stream()
        .map(continent->countryDao.findCountriesByContinent(continent)
        .stream().map(country->country.getCities().stream()
        .map(city->city.getPopulation()).
        max(Integer::compare).orElse(0)).collect(Collectors.toList())).collect(Collectors.toList()));

       
        
      

    }

}
