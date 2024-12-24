package Task3;

public class Main {
    public static void main(String[] args) {
       
        Complex<Double> complex=new Complex<>(5.0,2.0);
        Complex<Double> complex1=new Complex<>(5.0,20.0);
        Complex<Double> complex2=new Complex<>(5.6,20.3);
        Complex<Double> complex3=new Complex<>();
        complex3=complex3.addition(complex,complex2);
        complex3.displayComplex();

    }
}
