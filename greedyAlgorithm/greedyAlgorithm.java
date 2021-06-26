package GreedyAlgorithm;

public class greedyAlgorithm {

    public static void main(String[] args) {
        int price = 8370;
        int[] coins = {500, 100, 50, 10};
        int[] counts = {20, 20, 20, 20};
        int count;

        for(int i=0; i< 4; i++) {
            count = 0;
            count = price / coins[i];
            price = price % coins[i];
            counts[i] -= count;

            System.out.println(coins[i] + "원짜리 : " + count + "개 필요");

        }
    }
}
