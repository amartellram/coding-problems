package amartell.hackerrank.weekprep.day3;

public class CaesarCipher {

    public static String caesarCipher(String s, int k) {

        StringBuilder cipheredString = new StringBuilder(s.length());

        for(int i = 0; i< s.length(); i++)
        {
            char ch = s.charAt(i);

            if(Character.isLetter(ch)) {
                if(Character.isUpperCase(ch)){
                    cipheredString.append((char)((ch+k-65) % 26 + 65));
                }
                else {
                    cipheredString.append((char)((ch+k-97) % 26 + 97));
                }
            }
            else {
                cipheredString.append(ch);
            }

        }
        return cipheredString.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("abc-xyz", 3));
    }
}
