package LuckyItemRecommendation;

import java.util.Scanner;

public class WhatDoing extends GoingHow {
    public void whatDoing(){
        Scanner sc = new Scanner(System.in);
        String[] doing = {"1. 공 부", "2. 수 다", "3.액티비티", "4. 산 책",
                    "5. 업 무", "6. 관 람", "7. 수 영", "8. 독 서", "9.멍때리기"};
        while (true){
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ 무 엇 을 하 실 건 가 요 ? ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            for(String s : doing){
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ+ ⊹ ｡ ･."+ "\n");

            int doingChoice = 0;

            try{
                System.out.println(".･ ｡ ⊹ + ஐ ஐ 당 신 의 선 택 은 ? ஐ ஐ + ⊹ ｡ ･.");
                doingChoice = sc.nextInt();
                switch (doingChoice){
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        luckyPrint();
                    }

                    default -> {
                        System.out.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");
                        System.out.println(".･ ｡ ⊹ + ஐ 다 시 입 력 헤 주 세 요 ! ஐ + ⊹ ｡ ･."+ "\n");
                        continue;
                    }
                }
            }
            catch(Exception e){
                System.err.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");

                continue;
            }
        }
    }

}
