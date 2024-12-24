package Temp;

import java.util.Arrays;

 class Lab3 {
    public static void main(String[] args) {
    Temp.Fahren t=new Fahren();
    double celisuse=25.0;
        Double apply = t.apply(celisuse);
        System.out.println(apply);
        Quads quad = new Quads();
        double a = 2;
        double b = 4;
        double c = -6;
        double[] constants = { a, b, c };
        try {
            System.out.println(Arrays.toString(quad.apply(constants)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
