package amartell.hackerrank.problemsolving;

public class CatsAndMouse {

    static String catAndMouse(int x, int y, int z) {

       int distanceX = Math.abs(x-z);
       int distanceY = Math.abs(y-z);

       if(distanceX == distanceY)
           return "Mouse C";
       else if(distanceX < distanceY)
           return "Cat A";
       else
           return "Cat B";

    }

    public static void main(String[] args) {

    }
}
