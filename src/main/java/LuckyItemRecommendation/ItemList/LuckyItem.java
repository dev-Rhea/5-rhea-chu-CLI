package LuckyItemRecommendation.ItemList;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class LuckyItem implements LuckyList{
    public void luckyItem() {
        // 랜덤 출력
        try {
            TimeUnit.SECONDS.sleep(3);
            ArrayList<String> luckyItems = new ArrayList<>();

            luckyItems.add("장 미 꽃 다 발");
            luckyItems.add("황 금 열 쇠");
            luckyItems.add("복 권");
            luckyItems.add("영 양 제");
            luckyItems.add("손 수 건");
            luckyItems.add("부 채");
            luckyItems.add("이 어 폰");
            luckyItems.add("리 모 콘");
            luckyItems.add("펜");

            int randomIndex = (int) (Math.random() * luckyItems.size());
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ " + luckyItems.get(randomIndex) +" ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void luckyColor() {
        try {
            TimeUnit.SECONDS.sleep(3);
            ArrayList<String> luckyColors = new ArrayList<>();

            luckyColors.add("R E D");
            luckyColors.add("B L U E");
            luckyColors.add("Y E L L O W");
            luckyColors.add("P U R P L E");
            luckyColors.add("G R E E N");
            luckyColors.add("O R A N G E");

            int randomIndex = (int) (Math.random() * luckyColors.size());
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ " + luckyColors.get(randomIndex) +" ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void luckyNumber() {
        try {
            TimeUnit.SECONDS.sleep(3);
            int randomIndex = (int) (Math.random() * 100) + 1; // 1부터 100까지의 무작위 숫자 생성
            System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ " + randomIndex +" ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
