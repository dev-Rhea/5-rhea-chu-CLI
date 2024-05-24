package LuckyItemRecommendation;

import java.util.Scanner;

public class GoingHow extends UserChoice{
    public void GoHow(){
        Scanner sc = new Scanner(System.in);
        String[] how = {"1. 버 스", "2. 지하철", "3. 기 차",
                    "4. 비행기", "5. 고속 버스", "6. 자전거", "7. 킥보드", "8. 택 시", "9. 걸어서"};
        String howMsg = "어 떻 게 가 볼 건 가 요?";
        UserInputHandler(how, howMsg, 9);
        WhatDoing whatDoing = new WhatDoing();
        whatDoing.WhatDo();
    }
}
