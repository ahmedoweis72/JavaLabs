public class StringUtils {
    
    public static String betterString(String string1,String string2,BetterrString b){
        if (b.greater(string1, string2)==true) {
            return string1;
        }else{
            return string2;
        }
    }
}
