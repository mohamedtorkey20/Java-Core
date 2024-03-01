public class CheckString {
    public static boolean checkString(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] argus) {
       
       if(argus.length==1)
       {
        System.out.println(checkString(argus[0]));
       
       }
    }
}

