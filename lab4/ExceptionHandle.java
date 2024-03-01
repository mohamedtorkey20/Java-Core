public class ExceptionHandle{
public static void main(String argus[])
{
ExpectionMethods m= new ExpectionMethods();

        try {
        
        int x=  Integer.parseInt(argus[0]);
        int y=  Integer.parseInt(argus[1]);
          m.divide(x,y);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        } 
        
        
        try {  
            m.ipLength(argus[2]);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        } 
        
        try {  
            m.iPOctalRange(argus[2]);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        } 
        
    }
}

