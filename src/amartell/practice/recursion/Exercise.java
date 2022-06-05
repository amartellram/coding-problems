package amartell.practice.recursion;

public class Exercise {

    public static String reverse(String s){
        if(s.length() == 0) return "";
        return s.substring(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }

    public static boolean isPalindrome(String s){
        if(s.length()<=1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1,s.length()-1));
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reverse("java"));
        System.out.println(isPalindrome("assa"));
    }
}
