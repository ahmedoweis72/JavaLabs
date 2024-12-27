import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<Character,Map<String,String>> dicMap=new HashMap<>();
        
        Map<String,String> searchMap(Character c){
           
            return  this.dicMap.get(c);
        }
     
void AddToDic(Character c, Map<String, String> mapD) {
    if (c != null) {
        this.dicMap.put(c, mapD);
    } 
    
}

}
