class Task4 {
    public static int ocureences(String s,String ocuur){
        String ocuured=ocuur.toLowerCase();
        String sentance=s.toLowerCase();
        int ocuuredCount=0;
        while (sentance.contains(ocuured)) {
            ocuuredCount++;
            sentance = sentance.substring(sentance.indexOf(ocuured) + ocuured.length());
        }


        return ocuuredCount;

    }
    public static void main(String[] args) {

        String s1="ITI develops people and ITI house of developers and ITI for people";
        System.out.println(ocureences(s1,"iti"));
    }
}