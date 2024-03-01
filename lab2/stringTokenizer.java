import java.util.StringTokenizer;
class  Stringwords{
  public static void main(String args[]){
  
  
  if(args.length==1)
  {
StringTokenizer st1 = new StringTokenizer(args[0], "ITI");

        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());
  }else
  {
  System.out.println("Please Enter one arguments");
  }
  
  }
}
