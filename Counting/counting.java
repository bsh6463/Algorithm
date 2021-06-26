package Counting;

import java.util.Arrays;

public class counting {

    public static void main(String[] args) {

        int[] people = {55, 40, 22, 99, 76, 81, 29, 31, 33, 65};

        int[] ages = new int[11]; //연령에 따라

        for(int i = 0; i< people.length; i++){
            int age = people[i];
            if(age < 30) ages[2]++;
            else if(age < 40) ages[3]++;
            else if(age < 50) ages[4]++;
            else if(age < 60) ages[5]++;
            else if(age < 70) ages[6]++;
            else if(age < 80) ages[7]++;
            else if(age < 90) ages[8]++;
            else ages[9]++;

        }

        int temp = 20;
        int number = people.length;
        for(int i=2; i < ages.length-1; i++){

            System.out.println(number + "명 중 " + temp + " 대는 : " + ages[i] + "명");

            temp +=10;

        }



    }
}
