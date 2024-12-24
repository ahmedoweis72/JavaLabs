package Task3;

public class Complex<T extends Number> {

    private T real;
    private T imaginary;

    public Complex(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }public Complex() {
        
    }

    public T getReal() {
        return real;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public T getImaginary() {
        return imaginary;
    }

    public void setImaginary(T imaginary) {
        this.imaginary = imaginary;
    }
    public Complex<Double>  addition(Complex<Double> c1,Complex<Double> c2){
        Complex<Double> c3=new Complex<>();

        c3.real=c1.real+c2.real;
        c3.imaginary=c1.imaginary+c2.imaginary;
        return c3;
     }public Complex<Double> Subtraction(Complex<Double> c1,Complex<Double> c2){
        Complex<Double> c3=new Complex<>();

        c3.real=c1.real-c2.real;
        c3.imaginary=c1.imaginary-c2.imaginary;
        return c3;
     }
     public Complex<Double> divisionComplex(Complex<Double> c1,Complex<Double> c2){
        Complex<Double> c3=new Complex<>();
 
        c3.real=c1.real/c2.real;
        c3.imaginary=c1.imaginary/c2.imaginary;
        return c3;
     }
     public Complex<Double> multiplyComplex(Complex<Double> c1,Complex<Double> c2){
        Complex<Double> c3=new Complex<>();
 
        c3.real=c1.real*c2.real;
        c3.imaginary=c1.imaginary*c2.imaginary;
        return c3;
     }
     public void displayComplex(){
        System.out.println(this.real+"+"+this.imaginary+"t");
     }

}
