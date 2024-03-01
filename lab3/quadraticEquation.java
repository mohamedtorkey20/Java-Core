import java.util.function.Function;

class Equation  implements  Function<Operand,Roots>
{
public  Roots apply(Operand op)
{
float a=op.getA();
float b=op.getB();
float c=op.getC();

float r1,r2;
float determinant = (float)(b * b - 4 * a * c);
if (determinant > 0) {
     r1 = (float)(-b + Math.sqrt(determinant)) / (2 * a);
    r2 =(float) (-b - Math.sqrt(determinant)) / (2 * a);
      return new Roots(r1,r2,false);
}else if (determinant == 0) {
      r1 = r2 = (float)(-b / (2 * a));
      System.out.println(r1);
      return new Roots(r1,false);
}else
{
     float real =(float) -b / (2 * a);
     float imag= (float) Math.sqrt(-determinant) / (2 * a);
     return new Roots(real,imag,true);
      
}
}

}
class QuadraticEquationSolver {
    public static void main(String[] args) {
        if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            float c = Float.parseFloat(args[2]);
            Operand op = new Operand(a, b, c);

            Equation eq = new Equation();
            Roots r = eq.apply(op);

            if (r.getimaginary()) {
                // Imaginary roots
                System.out.format("root1 = %.2f+%.2fi\n", r.getroot1(), r.getroot2());
               System.out.format("root2 = %.2f-%.2fi\n", r.getroot1(), r.getroot2());
            } else {
                // Real roots
                System.out.println("Root 1: " + r.getroot1());
                System.out.println("Root 2: " + r.getroot2());
            }
        } else {
            System.out.println("Please enter three arguments: a, b, c");
        }
    }
}

