package LuckyItemRecommendation;

import java.util.Scanner;

public class MeetWho extends UserChoice{
    public void MeetWho(){
        Scanner sc = new Scanner(System.in);
        String[] who = {"1. 가 족", "2. 친 구", "3. 애 인", "4. 지 인"
                , "5. 교수님", "6. 상 사", "7. 낯선이", "8. 동 료"};

        while (true){
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ 누 구 와 만 날 건 가 요 ? ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            for(String s : who){
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
//            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 1. 가 족 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
//            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 2. 친 구 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
//            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 3. 애 인 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
//            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 4. 지 인 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
//            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 5. 교수님 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
//            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 6. 상 사 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
//            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 7. 낯선이 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
//            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 8. 동 료 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ+ ⊹ ｡ ･." + "\n");

            int whoChoice = 0;

            try{
                System.out.println(".･ ｡ ⊹ + ஐ ஐ 당 신 의 선 택 은 ? ஐ ஐ + ⊹ ｡ ･.");
                whoChoice = sc.nextInt();
                switch (whoChoice){
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        GoingWhere();
                    }
                    default -> {
                        System.out.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");
                        System.out.println(".･ ｡ ⊹ + ஐ 다 시 입 력 헤 주 세 요 ! ஐ + ⊹ ｡ ･." + "\n");
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
