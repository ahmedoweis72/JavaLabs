 class Task3 {
    public static int ocureences(String s,String ocuur){
        String ocuured=ocuur.toLowerCase();
        String arr[]=s.split(" ");
        int count=0;
        for (int i=0;i<arr.length;i++){

            if (arr[i].toLowerCase().equals(ocuured)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

    String s1="ITI develops people and ITI house of developers and ITI for people";
        System.out.println(ocureences(s1,"iti"));
    }
}
