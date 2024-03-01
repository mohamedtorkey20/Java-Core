

public class ExpectionMethods {
    public void divide(int x,int y) throws MyCustomException {
    
        if(y==0)
        {
        throw new MyCustomException("Invalid to divide on Zero");
        }else
        {
        System.out.println("x/y =" + x/y);
        }
    }
    
       public void ipLength(String ip) throws MyCustomException {
    
      String splitIpv4[]=ip.split("\\.");
      if(splitIpv4.length==4)
   {
      System.out.println("Done");
    }else
    {
    throw new MyCustomException("Invalid to IP ");
    }
   }
  public void iPOctalRange(String ip) throws MyCustomException {
    
    String splitIpv4[]=ip.split("\\.");
      
    int  Octals[]= new int[4];
    boolean Valid=true; 
    
    for(int i=0;i<Octals.length;i++) {
        Octals[i]=Integer.parseInt(splitIpv4[i]);  
    }
    
    for(int i=0;i<Octals.length;i++) {
        if(!(Octals[i] >= 0 && Octals[i] <= 255)) { 
            Valid=false;
            break; 
        }
    }
     
    if(!Valid) { 
        throw new MyCustomException("Invalid Octal to IP ");
    } else {
        System.out.println("Done");
    }
}

}
