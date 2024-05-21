package LuckyItemRecommendation;

import LuckyItemRecommendation.ItemList.LuckyItem;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserChoice implements LuckyItemQuestion {
    Scanner sc = new Scanner(System.in);

    @Override
    public void TodayWeather() {
        String[] weather;
        int weatherChoice;
        String weatherMsg;

        while (true) {
            weather  = new String[]{"1. 맑음", "2. 흐림", "3. 비", "4. 더움", "5. 추움"};
            weatherMsg = "오 늘 의 날 씨 는?";
            MainMsg(weatherMsg);
            for (String s : weather) {
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
            ChoiceMsg();

            try {
                weatherChoice = sc.nextInt();
                switch (weatherChoice) {
                    case 1, 2, 3, 4, 5 -> {
                        TodayFeelings();
                    }
                    default -> {
                        ErrorMsg();
                        continue;
                    }
                }
            } catch (Exception e) {
                ErrorMsg();
                weatherChoice = sc.nextInt(); // 컈치안에서 무한 반복 탈출 위해서 재 초기화

            }

        }
    }

    @Override
    public void TodayFeelings() {
        String[] Feelings;
        int FeelingsChoice;
        String FeelingsMsg;

        while (true) {
            Feelings = new String[]{"1. 상 쾌", "2. 우 울", "3. 분 노", "4. 유 쾌",
                    "5. 평 범", "6. 짜 증", "7. 따 분", "8. 짜 릿"};
            FeelingsMsg = "오 늘 의 기 분 은 ?";

            MainMsg(FeelingsMsg);
            for(String s : Feelings){
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
            ChoiceMsg();

            try {
                FeelingsChoice = sc.nextInt();
                switch (FeelingsChoice) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        AloneOrNot();
                    }
                    default -> {
                        ErrorMsg();
                        continue;
                    }
                }
            } catch (Exception e) {
                ErrorMsg();
                FeelingsChoice = sc.nextInt(); // 컈치안에서 무한 반복 탈출 위해서 재 초기화
            }
        }

    }

    @Override
    public void AloneOrNot() {
        String[] alone;
        int aloneOrNotChoice;
        String aloneMsg;

        while (true) {
            alone  = new String[]{"1. 네", "2. 아니오"};
            aloneMsg = "혼 자 이 신 가 요 ?";

            MainMsg(aloneMsg);
            for(String s : alone){
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
            ChoiceMsg();

            try {
                aloneOrNotChoice = sc.nextInt();
                switch (aloneOrNotChoice) {
                    case 1 -> {
                        GoingWhere();
                    }
                    case 2 -> {
                        MeetWho who = new MeetWho();
                        who.MeetWho();
                    }
                    default -> {
                        ErrorMsg();
                        aloneOrNotChoice = sc.nextInt(); // 컈치안에서 무한 반복 탈출 위해서 재 초기화
                    }
                }
            } catch (Exception e) {
                ErrorMsg();
                continue;
            }
        }
    }

    public void GoingWhere() {
        String[] where;
        int whereChoice;
        String whereMsg;

        while (true) {
            where = new String[]{"1. 카 페", "2. 도서관", "3. 학 교", "4. 회 사",
                    "5. 놀이 공원", "6. 바 다", "7. 숲 & 산", "8. 전 시 회", "9. 집이 최고"};
            whereMsg = "어 디 로 가 볼 건 가 요?";

            MainMsg(whereMsg);
            for(String s : where){
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ " + s + " ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            }
            ChoiceMsg();

            try {
                whereChoice = sc.nextInt();
                switch (whereChoice) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        GoingHow how = new GoingHow();
                        how.GoHow();
                    }
                    default -> {
                        ErrorMsg();
                        continue;
                    }
                }
            } catch (Exception e) {
                ErrorMsg();
                whereChoice = sc.nextInt(); // 컈치안에서 무한 반복 탈출 위해서 재 초기화
            }
        }
    }

    @Override
    public void LuckyPrint() {
        while(true){
            String last;
            String itemList;
            System.out.println(".･ ｡ ⊹ + ஐ 행 운 을 불 러 오 는 중 ஐ + ⊹ ｡ ･." + "\n");
            try {
                TimeUnit.SECONDS.sleep(3);
                itemList = "아 이 템 은 ?";
                LuckyListPrint(itemList);
                LuckyItem item = new LuckyItem();
                item.LuckyThing();

                itemList = "컬 러 는 ?";
                LuckyListPrint(itemList);
                item.LuckyColor();

                itemList = "숫 자 는 ?";
                LuckyListPrint(itemList);
                item.LuckyNumber();

                System.out.println(" .･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
                System.out.println(" .･ ｡ ⊹ + ஐ 추 천 템 을 활 용 하 시 고 ஐ + ⊹ ｡ ･.");
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 오 늘 하 루 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
                System.out.println(".･ ｡ ⊹ + ஐ ஐ 행 운 이 가 득 하 기 를 ஐ ஐ + ⊹ ｡ ･.");
                System.out.println(" .･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");

                System.out.println(" .･ ｡ ⊹ + ஐ 다 시 하 시 겠 습 니 까 ? ஐ + ⊹ ｡ ･.");
                System.out.println("  .･ ｡ ⊹ + ஐ ஐ ஐ ஐ y / n ஐ ஐ ஐ ஐ + ⊹ ｡ ･."+ "\n");

                last  = sc.next();
                switch (last){
                    case "y" -> {
                        TodayWeather();
                    }
                    case "n" -> {
                        System.out.println(".･ ｡ ⊹ + ஐ ஐ 행 운 을 빕 니 다 ஐ ஐ *+ ⊹ ｡ ･.");
                        System.out.println(".･ ｡ ⊹ + ஐ ஐ T H E - E N D ஐ ஐ *+ ⊹ ｡ ･.");
                        System.exit(0);
                    }
                    default -> {
                        ErrorMsg();
                        EndOrNot();
                        break;
                    }
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private void EndOrNot() {
        String ans = sc.nextLine();

        System.out.println(" .･ ｡ ⊹ + ஐ 다 시 하 시 겠 습 니 까 ? ஐ + ⊹ ｡ ･.");
        System.out.println("  .･ ｡ ⊹ + ஐ ஐ ஐ ஐ y / n ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");

        switch (ans){
            case "y" -> {
                TodayWeather();
            }
            case "n" -> {
                System.out.println(".･ ｡ ⊹ + ஐ ஐ 행 운 을 빕 니 다 ஐ ஐ *+ ⊹ ｡ ･.");
                System.out.println(".･ ｡ ⊹ + ஐ ஐ T H E - E N D ஐ ஐ *+ ⊹ ｡ ･.");
                System.exit(0);
            }
            default -> {
                EndOrNot();
                break;
            }
        }
    }

    // 입력 오류 메세지
    public void ErrorMsg(){
        System.out.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ + ஐ 다 시 입 력 헤 주 세 요 ! ஐ + ⊹ ｡ ･."+ "\n");
    }

    // 숫자 입력 메세지
    public void ChoiceMsg(){
        System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
        System.out.println(".･ ｡ ⊹ + ஐ ஐ 당 신 의 선 택 은 ? ஐ ஐ + ⊹ ｡ ･.");
    }

    // 메인 메세지
    public void MainMsg(String msg){
        System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ + ஐ ஐ " + msg +" ஐ ஐ + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
    }

    // 행운 목록 출력 메세지
    private void LuckyListPrint(String list){
        System.out.println(".･ ｡ ⊹ + ஐ 당 신 의 행 운 을 높 여 줄 ஐ + ⊹ ｡ ･.");
        System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ "+ list +" ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
    }
}
