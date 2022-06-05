package amartell.hackerrank.problemsolving;

import java.util.List;

public class FlippingMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {

        int sum = 0;
        int n = matrix.size()/2;
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                int p1=matrix.get(i).get(2*n -j -1);
                int p2=matrix.get(i).get(j);
                int p3=matrix.get(2*n -i-1).get(j);
                int p4=matrix.get(2*n -i-1).get(2*n -j -1);

                sum+=Math.max(p1, Math.max(p2, Math.max(p3, p4)));
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        
    }
}
