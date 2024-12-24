package Temp;
import java.util.function.Function;

public class Fahren implements Function <Double,Double>{
    @Override
    public Double apply(Double temp) {
        return (temp * 9 / 5) + 32;

    }
}
