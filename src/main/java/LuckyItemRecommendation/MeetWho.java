package LuckyItemRecommendation;

import java.util.Scanner;

public class MeetWho extends UserChoice{
    public void MeetWho(){
        Scanner sc = new Scanner(System.in);
        String[] who;
        int whoChoice;
        String whoMsg;

        while (true){
            who = new String[] {"1. 가 족", "2. 친 구", "3. 애 인", "4. 지 인"
                    , "5. 교수님", "6. 상 사", "7. 낯선이", "8. 동 료"};
            whoMsg = "누 구 와 만 날 건 가 요?";

            MainMsg(whoMsg);
            for(String s : who){
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
            ChoiceMsg();

            try{
                whoChoice = sc.nextInt();
                switch (whoChoice){
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        GoingWhere();
                    }
                    default -> {
                        ErrorMsg();
                        continue;
                    }
                }
            }
            catch(Exception e){
                ErrorMsg();
                whoChoice = sc.nextInt(); // 컈치안에서 무한 반복 탈출 위해서 재 초기화
            }
        }
    }
}
