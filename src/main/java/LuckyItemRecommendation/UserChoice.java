package LuckyItemRecommendation;

import LuckyItemRecommendation.ItemList.LuckyItem;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserChoice implements LuckyItemQuestion {
    Scanner sc = new Scanner(System.in);

    @Override
    public void TodayWeather() {
        while (true) {
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ 오 늘 의 날 씨 는 ? ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 1. 맑 음 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 2. 흐 림 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ  3. 비  ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 4. 더 움 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 5. 추 움 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");

            int whetherChoice = 0;
            try {
                System.out.println(".･ ｡ ⊹ + ஐ ஐ 당 신 의 선 택 은 ? ஐ ஐ + ⊹ ｡ ･.");
                whetherChoice = sc.nextInt();
                switch (whetherChoice) {
                    case 1, 2, 3, 4, 5 -> {
                        TodayFeelings();
                    }
                    default -> {
                        System.out.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");
                        System.out.println(".･ ｡ ⊹ + ஐ 다 시 입 력 헤 주 세 요 ! ஐ + ⊹ ｡ ･."+ "\n");
                        continue;
                    }
                }
            } catch (Exception e) {
                System.err.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");

                continue;
            }

        }
    }

    @Override
    public void TodayFeelings() {
        while (true) {
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ 오 늘 의 기 분 은 ? ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 1. 상 쾌 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 2. 우 울 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 3. 분 노 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 4. 유 쾌 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 5. 평 범 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 6. 짜 증 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 7. 따 분 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 8. 짜 릿 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");

            int FeelingsChoice = 0;
            try {
                System.out.println(".･ ｡ ⊹ + ஐ ஐ 당 신 의 선 택 은 ? ஐ ஐ + ⊹ ｡ ･.");
                FeelingsChoice = sc.nextInt();
                switch (FeelingsChoice) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        AloneOrNot();
                    }
                    default -> {
                        System.out.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");
                        System.out.println(".･ ｡ ⊹ + ஐ 다 시 입 력 헤 주 세 요 ! ஐ + ⊹ ｡ ･."+ "\n");
                        continue;
                    }
                }
            } catch (Exception e) {
                System.err.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");

                continue;
            }
        }

    }

    @Override
    public void AloneOrNot() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ 혼 자 이 신 가 요 ? ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 1.  네  ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 2. 아니오 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ 당 신 의 선 택 은 ? ஐ ஐ + ⊹ ｡ ･.");

            int aloneOrNotChoice = 0;
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
                        System.out.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");
                        System.out.println(".･ ｡ ⊹ + ஐ 다 시 입 력 헤 주 세 요 ! ஐ + ⊹ ｡ ･."+ "\n");
                        continue;
                    }
                }
            } catch (Exception e) {
                System.err.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");

                continue;
            }
        }
    }

    public void GoingWhere() {
        while (true) {
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ 어 디 로 가 볼 건 가 요 ? ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 1. 카 페 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 2. 도서관 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 3. 학 교 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 4. 회 사 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 5. 놀이 공원 ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 6. 바 다 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 7. 숲 & 산 ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 8. 전 시 회 ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 9. 집이 최고 ஐ ஐ ஐ + ⊹ ｡ ･.");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
            System.out.println(".･ ｡ ⊹ + ஐ ஐ 당 신 의 선 택 은 ? ஐ ஐ + ⊹ ｡ ･.");

            int whereChoice = 0;

            try {
                whereChoice = sc.nextInt();
                switch (whereChoice) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                        GoingHow how = new GoingHow();
                        how.goingHow();
                    }
                    default -> {
                        System.out.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");
                        System.out.println(".･ ｡ ⊹ + ஐ 다 시 입 력 헤 주 세 요 ! ஐ + ⊹ ｡ ･."+ "\n");
                        continue;
                    }
                }
            } catch (Exception e) {
                System.err.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･.");

                continue;
            }
        }
    }

    @Override
    public void luckyPrint() {
        while(true){
            System.out.println(".･ ｡ ⊹ + ஐ 행 운 을 불 러 오 는 중 ஐ + ⊹ ｡ ･." + "\n");
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(".･ ｡ ⊹ + ஐ 당 신 의 행 운 을 높 여 줄 ஐ + ⊹ ｡ ･.");
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ 아 이 템 은 ? ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
                LuckyItem item = new LuckyItem();
                item.luckyItem();
                System.out.println(".･ ｡ ⊹ + ஐ ஐ 당 신 의 행 운 을 높 여 줄 ஐ ஐ + ⊹ ｡ ･.");
                System.out.println("  .･ ｡ ⊹ + ஐ ஐ ஐ ஐ 컬 러 는 ? ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
                item.luckyColor();
                System.out.println(".･ ｡ ⊹ + ஐ 당 신 의 행 운 을 높 여 줄 ஐ + ⊹ ｡ ･.");
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 숫 자 는 ? ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
                item.luckyNumber();

                System.out.println(" .･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
                System.out.println(" .･ ｡ ⊹ + ஐ 추 천 템 을 활 용 하 시 고 ஐ + ⊹ ｡ ･.");
                System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ ஐ 오 늘 하 루 ஐ ஐ ஐ ஐ + ⊹ ｡ ･.");
                System.out.println(".･ ｡ ⊹ + ஐ ஐ 행 운 이 가 득 하 기 를 ஐ ஐ + ⊹ ｡ ･.");
                System.out.println(" .･ ｡ ⊹ + ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");

                System.out.println(" .･ ｡ ⊹ + ஐ 다 시 하 시 겠 습 니 까 ? ஐ + ⊹ ｡ ･.");
                System.out.println("  .･ ｡ ⊹ + ஐ ஐ ஐ ஐ y / n ஐ ஐ ஐ ஐ + ⊹ ｡ ･."+ "\n");

                String last = sc.next();

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
                        System.out.println(".･ ｡ ⊹ + ஐ 잘 못 된 입 력 입 니 다 ! ஐ + ⊹ ｡ ･." + "\n");
                        endOrNot();
                        break;
                    }
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private void endOrNot() {
        System.out.println(" .･ ｡ ⊹ + ஐ 다 시 하 시 겠 습 니 까 ? ஐ + ⊹ ｡ ･.");
        System.out.println("  .･ ｡ ⊹ + ஐ ஐ ஐ ஐ y / n ஐ ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");

        String ans = sc.nextLine();
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
                endOrNot();
                break;
            }
        }
    }
}
