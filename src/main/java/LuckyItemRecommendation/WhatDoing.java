package LuckyItemRecommendation;

import java.util.Scanner;

public class WhatDoing extends GoingHow {
    public void WhatDo(){
        Scanner sc = new Scanner(System.in);
        String[] doing;
        int doingChoice;
        String doingMsg;

        while (true){
            doing = new String[]{"1. 공 부", "2. 수 다", "3.액티비티", "4. 산 책",
                    "5. 업 무", "6. 관 람", "7. 수 영", "8. 독 서", "9.멍때리기"};
            doingMsg = "무 엇 을 하 실 건 가 요?";

            MainMsg(doingMsg);
            for(String s : doing){
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
            ChoiceMsg();

            try{
                doingChoice = sc.nextInt();
                switch (doingChoice){
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        LuckyPrint();
                    }

                    default -> {
                        ErrorMsg();
                        continue;
                    }
                }
            }
            catch(Exception e){
                ErrorMsg();
                doingChoice = sc.nextInt(); // 컈치안에서 무한 반복 탈출 위해서 재 초기화
            }
        }
    }

}
