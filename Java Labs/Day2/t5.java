import java.util.StringTokenizer;

 class Task5 {

    public static void main(String[] args) {

    String sentence="ITI develops people and ITI house of developers and ITI for people";
        int count = 0;

        String word="ITI";

        StringTokenizer tokenizer = new StringTokenizer(sentence, word);
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
            count++;
        }
        System.out.println(count);
    }
}
