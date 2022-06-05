package amartell.practice;

import java.util.Arrays;
import java.util.List;

public class DiskSpaceAnalysis {

    public static int hardDiskSpace(List<Integer> spaces, int size){

        int minAll = Integer.MAX_VALUE;

        for(int i = 0; i + size <= spaces.size(); i++) {
                int j = i;
                int min = spaces.get(j);
                while(j -i < size)
                {
                    System.out.println("spaces["+j+"]:"+ spaces.get(j));
                    if(spaces.get(j) < min)
                        min = spaces.get(j);
                    j++;
                }

                System.out.println("min: " + min);

                if(min < minAll)
                    minAll = min;

        }

        return minAll;
    }

    public static void main(String[] args) {
            List<Integer> diskSpace = Arrays.asList(8,2,4,6);
            int size = 3;
            System.out.println(hardDiskSpace(diskSpace, size));
    }
}
