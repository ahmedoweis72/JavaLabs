

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      System.out.println(countryDao.findAllCountries().stream()
      .map(country->country.getCities().stream()
      .map(city->city.getPopulation()).
      max(Integer::compare).orElse(0)).collect(Collectors.toList()));
   }

}