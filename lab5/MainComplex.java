import java.math.BigDecimal;

public class MainComplex {
    public static void main(String[] args) {
        
        ComplexNumber<BigDecimal> complex1 = new ComplexNumber<>(BigDecimal.valueOf(5), BigDecimal.valueOf(4));
        ComplexNumber<BigDecimal> complex2 = new ComplexNumber<>(BigDecimal.valueOf(1), BigDecimal.valueOf(2));

        ComplexNumber<BigDecimal> sum = complex1.addComplex(complex2);
        ComplexNumber<BigDecimal> sub = complex1.subComplex(complex2);
        ComplexNumber<BigDecimal> multi = complex1.multiComplex(complex2);
        ComplexNumber<BigDecimal> divide = complex1.divideComplex(complex2);

      
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImag() + "i");
        System.out.println("Difference: " + sub.getReal() + " + " + sub.getImag() + "i");
        System.out.println("Product: " + multi.getReal() + " + " + multi.getImag() + "i");
        System.out.println("Quotient: " + divide.getReal() + " + " + divide.getImag() + "i");


    }
}

