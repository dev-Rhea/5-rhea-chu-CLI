package LuckyItemRecommendation;

import java.util.Scanner;

public class GoingHow extends UserChoice{
    public void GoHow(){
        Scanner sc = new Scanner(System.in);
        String[] how;
        int howChoice;
        String howMsg;

        while(true){
            how = new String[]{"1. 버 스", "2. 지하철", "3. 기 차",
                    "4. 비행기", "5. 고속 버스", "6. 자전거", "7. 킥보드", "8. 택 시", "9. 걸어서"};
            howMsg = "어 떻 게 가 볼 건 가 요?";

            MainMsg(howMsg);
            for(String s : how){
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
            ChoiceMsg();

            try{
                howChoice = sc.nextInt();
                switch (howChoice) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        WhatDoing doing = new WhatDoing();
                        doing.WhatDo();
                    }
                    default -> {
                        ErrorMsg();
                        continue;
                    }

                }
            }
            catch(Exception e){
                ErrorMsg();
                howChoice = sc.nextInt(); // 컈치안에서 무한 반복 탈출 위해서 재 초기화
            }
        }
    }
}
