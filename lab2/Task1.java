import java.util.*;
class  Min_Max{
  public static void main(String args[]){
long Time_Before=System.currentTimeMillis();
int numbers[]=new int[1000];

for(int i=0;i<numbers.length;i++)
{
 numbers[i]=(int)(Math.random()*1000);
}
int min=numbers[0];
int max=numbers[0];

for(int j=0;j<numbers.length;j++)
{

if(min>numbers[j])
{
min=numbers[j];
}

if(max<numbers[j])
{
max=numbers[j];
}

}

System.out.println("min =" + min );
System.out.println("max=" + max );

  long Time_After= System.currentTimeMillis();
  
  long Time =Time_After-Time_Before;
  
  System.out.println( "the time:"+ Time);
    
  }
}
