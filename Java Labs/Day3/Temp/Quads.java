package Temp;

import java.util.function.Function;
import java.util.function.Predicate;

class Quads implements Function<double[], double[]> {


        @Override
        public double[] apply(double[] constants) {
        double a=constants[0];
        double b=constants[1];
        double c=constants[2];
        double d=b*b-4*a*c;
        if (d<0)
            throw new ArithmeticException();
        else if (a==0)
            throw new ArithmeticException();
        else {
            double dPos=-(b+Math.sqrt(d))/(2*a);
            double dNeg=-(b-Math.sqrt(d))/(2*a);
            return new double[]{dPos,dNeg};
        }
        }
        }



