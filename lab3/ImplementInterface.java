class Convert implements  CelsiusToFahrenheit<Float,Float>
{
public Float ConvertCelsiusToFahrenheit(Float  Celsius)
{
Float Fahrenheit=(Celsius * 9/5) + 32;
return Fahrenheit;
}
}


class Fahrenheit {

 public static void main(String[] args) {
 
if(args.length==1)
{
 Float temp=Float.parseFloat(args[0]);
 Convert  f=new Convert();
  Float x=f.ConvertCelsiusToFahrenheit(temp);
  System.out.println(x+"F");
}else
{
System.out.println("Please Enter One arguments");
}
 }

}
