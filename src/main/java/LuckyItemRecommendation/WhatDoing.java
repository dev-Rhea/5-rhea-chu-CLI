package LuckyItemRecommendation;

import java.util.Scanner;

public class WhatDoing extends GoingHow {
    public void WhatDo(){
        Scanner sc = new Scanner(System.in);
        String[] doing = {"1. 공 부", "2. 수 다", "3.액티비티", "4. 산 책",
                    "5. 업 무", "6. 관 람", "7. 수 영", "8. 독 서", "9.멍때리기"};
        String doingMsg = "무 엇 을 하 실 건 가 요?";
        UserInputHandler(doing, doingMsg, 9);
        LuckyPrint();
    }
}
