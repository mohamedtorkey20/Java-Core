public class StringUtils {
    public static String betterString(String str1, String str2, InterfaceString x) {
        return x.test(str1, str2) ? str1 : str2;
    }
    
      public static void main(String[] args) {
        String string1 = "mohamed";
      String string2 = "torkey torkey";

String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
System.out.println("Longer: " + longer);


String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
System.out.println("First : " + first);
}

}

