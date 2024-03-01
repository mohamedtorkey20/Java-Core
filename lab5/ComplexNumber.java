import java.math.BigDecimal;
public class ComplexNumber<T extends BigDecimal> {
    private T real;
    private T imag;

    public ComplexNumber(T real, T imag) {
        this.real = real;
        this.imag = imag;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public void setImag(T imag) {
        this.imag = imag;
    }

    public T getReal() {
        return this.real;
    }

    public T getImag() {
        return this.imag;
    }

   public ComplexNumber addComplex(ComplexNumber c) {
       T  totalReal = (T) this.real.add(c.getReal());
       T  totalImag = (T) this.imag.add(c.getImag());
        return new ComplexNumber(totalReal, totalImag);
    }
    
  
    public ComplexNumber subComplex(ComplexNumber c) {
       T  totalReal =(T) this.real.subtract(c.getReal());
      T   totalImag = (T) this.imag.subtract(c.getImag());
        return new ComplexNumber(totalReal, totalImag);
    }
    
      public ComplexNumber multiComplex(ComplexNumber c) {
        // (a + bi)(c + di) = (ac - bd) + (ad + bc)i
        T totalReal = (T) this.real.multiply(c.getReal()).subtract(this.imag.multiply(c.getImag()));
        T totalImag = (T) this.real.multiply(c.getImag()).add(this.imag.multiply(c.getReal()));
        return new ComplexNumber(totalReal, totalImag);
    }

    public ComplexNumber divideComplex(ComplexNumber c) {
        // (a + bi) / (c + di) = ((ac + bd) / (c^2 + d^2)) + ((bc - ad) / (c^2 + d^2))i
        T divisor = (T) c.getReal().multiply(c.getReal()).add(c.getImag().multiply(c.getImag()));
        T totalReal = (T) (this.real.multiply(c.getReal()).add(this.imag.multiply(c.getImag()))).divide(divisor);
        T totalImag = (T) (this.imag.multiply(c.getReal()).subtract(this.real.multiply(c.getImag()))).divide(divisor);
          return new ComplexNumber(totalReal, totalImag);
    }
    
    
    
}

      
      
      
      
      
      
      

