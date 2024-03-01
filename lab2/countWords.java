import java.util.*;
class  Countwords{
  public static void main(String args[]){
   
   int counter=0;
   if(args.length==2)
   {
   String split_string[]=args[0].split(" ");
   for(int i=0;i<split_string.length;i++)
   {
    if(args[1].equals(split_string[i])){
    counter++;
    }
   }
   }else
   {
   System.out.println("Please Enter two arguments");
   }
  
  System.out.println("number of words:" + counter);
  }
}
