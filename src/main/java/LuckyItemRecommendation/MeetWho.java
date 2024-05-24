package LuckyItemRecommendation;

import java.util.Scanner;

public class MeetWho extends UserChoice{
    public void MeetWho(){
        Scanner sc = new Scanner(System.in);
        String[] who = {"1. 가 족", "2. 친 구", "3. 애 인", "4. 지 인"
                    , "5. 교수님", "6. 상 사", "7. 낯선이", "8. 동 료"};
        String whoMsg = "누 구 와 만 날 건 가 요?";
        UserInputHandler(who, whoMsg, 8);
        GoingWhere();
    }
}
