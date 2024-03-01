import java.util.*;
class  Ip{
  public static void main(String args[]){
   
boolean validIpv4=true;
   if(args.length==1)
   {
   String splitIpv4[]=args[0].split("\\.");
   if(splitIpv4.length==4)
   {
   for(int i=0;i<splitIpv4.length;i++)
   {
     int octal=Integer.parseInt(splitIpv4[i]);
      
     if(octal<0 & octal >255)
     {
     System.out.println("Invalid Octal");
     validIpv4=false;
     break;
     }
   }
   }else
   {
   System.out.println("Invalid IPV4");
     validIpv4=false;
   }
     if(validIpv4)
  {
    for(int i=0;i<splitIpv4.length;i++)
   {
      System.out.println(splitIpv4[i]);
   }
  }
  
   }else
  {
   System.out.println("Please Enter one arguments");
   }
  

 
}
}
