



import java.util.Objects;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
       
        int maxPopulation =  countryDao.findAllCountries().stream()
        .map(city->cityDao
        .findCityById(city.getCapital()))
        .filter(Objects::nonNull)
        .map(x->x.getPopulation()).max(Integer::compare).orElse(0);

System.out.println(maxPopulation);

    }

}