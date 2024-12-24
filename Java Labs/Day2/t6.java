

 class Task6 {

    public static void main(String[] args) {

    String sentence="192.168.1.155";
        int count = 0;

        String patern="^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
        String arr[]=sentence.split(" ");
        for (String word : arr) {
            boolean matches = word.matches(patern);
            if (matches) {
                System.out.println("Matched: " + word);
            }else {
                System.out.println("Not matched: " + word);
            }

        }


    }
}
