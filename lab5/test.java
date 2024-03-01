public class StringUtils {
    public static String betterString(String str1, String str2, TwoStringPredicate predicate) {
        return predicate.test(str1, str2) ? str1 : str2;
    }
    
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "world";

        // Using lambda expression to return the longer string
        String longer = betterString(string1, string2, (s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println("Longer string: " + longer);

        // Using anonymous class to return the first string always
        String first = betterString(string1, string2, new TwoStringPredicate() {
            @Override
            public boolean test(String s1, String s2) {
                return true;
            }
        });
        System.out.println("First string: " + first);
    }
}

