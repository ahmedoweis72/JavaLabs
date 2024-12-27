import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dictionary d=new Dictionary();
        Map<String, String> a = new HashMap<>();
        Map<String, String> b = new HashMap<>();
        a.put("apple", "تفاحة");
        a.put("available", "متاح");
        d.AddToDic('a',a);
        
        b.put("ball", "كرة");
        b.put("box", "صندوق");
        d.AddToDic('b', b);
        System.out.println(d.searchMap('a'));
        
    }
}