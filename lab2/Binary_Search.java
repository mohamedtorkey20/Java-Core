import java.util.*;
class  BinarySearch{
  public static void main(String args[]){
long timeBefore=System.currentTimeMillis();
int numbers[]=new int[1000];

for(int i=0;i<numbers.length;i++)
{
 numbers[i]=(int)(Math.random()*1000);
}

Arrays.sort(numbers);
int low=numbers[0];
int hight=numbers[numbers.length-1];
int  value=50;
boolean value_valid=false;
while(low<= hight)
{
 int m=(low+hight)/2;
 if(numbers[m]==value)
 {
   value_valid=true;
   break;
 }else if (numbers[m] > value)
{
 hight=m-1;
}else
{
low=m+1;
}
}
  if(value_valid)
  {
  System.out.println("Your Data exists");
  }else
  {
    System.out.println("Your Data  Doesn't exists");
  }
  long timeAfter= System.currentTimeMillis();
  
  long duration =timeAfter-timeBefore;
  
  System.out.println( "the duration:"+ duration);
    
  }
}
