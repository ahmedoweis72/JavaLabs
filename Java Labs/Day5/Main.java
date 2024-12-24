class Main {
  
    public static void main(String[] args) {
        String s1="Ahmed5";
        String s2="Ramadan";
       String x= StringUtils.betterString(s1,s2,(s11, s12) -> s11.length() > s12.length());
       System.out.println(x);
       
       IsAlphabetOnly a=(str)->{
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
            return true;
    };

    System.out.println(a.isAlphabetOnly(s1));
        
    }
}