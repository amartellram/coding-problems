package amartell.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TeamFormation2 {

    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {

        Collections.sort(skills);

        int n = skills.size();
        int teams = 0;

        int iMin=0, iMinAnt=0, iMax=0, iMaxAnt=0;
        boolean iMinFound = false, iMaxFound = false;


        for (int i = 0; i< n; i++){
            if(skills.get(i)<= maxLevel && !iMaxFound)
            {
                iMax = i;
            } else if(skills.get(i) > maxLevel) {
                iMaxFound = true;
            }
        }

        for (int i = n-1; i>=0; i--){
            if (skills.get(i)>= minLevel && !iMinFound){
                iMin = i;
            } else if(skills.get(i) < minLevel){
                iMinFound = true;
            }
        }
    int count =0;
        for(int j=minPlayers;j<iMax-iMin+1;j++)
            for (int i=iMin; i<=iMax;i++)
            {
                if(i+j<iMax)
                    count++;
            }
        return count;

    }

    public static int factorial(int n){
        int factorial = 1;
        for(int i = 2; i<=n;i++)
        {
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        List<Integer> skills = Arrays.asList(248,779,392,727,561);

        System.out.println(countTeams(skills, 2,360,1000));//5
        //11

    }
}
