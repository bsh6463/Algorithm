package BruteForceSearch;

public class bruteForceSearch {

    public static void main(String[] args) {

        int[] bills = {10, 20, 50, 100, 200, 500};

        int count = 0;
        int price = 3000;

        for(int i0 = price; i0 >=0; i0-=bills[0]){

            for(int i1=i0; i1>=0; i1-=bills[1]) {

                for (int i2 = i1; i2 >= 0; i2 -= bills[2]) {

                    for (int i3 = i2; i3 >= 0; i3 -= bills[3]) {

                        for (int i4 = i3; i4 >= 0; i4 -= bills[4]) {

                            if (i4 / bills[5] <= 0) {
                                count++;

                            }

                        }

                    }

                }
            }
        }

        System.out.println("지불 방법의 수 :  " + count);

    }

}
