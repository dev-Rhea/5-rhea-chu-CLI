package LuckyItemRecommendation.ItemList;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class LuckyItem implements LuckyList{
    // 랜덤 출력
    int randomIndex;
    public void LuckyThing() {
        ArrayList<String> luckyItems = new ArrayList<>();
        try {
            TimeUnit.SECONDS.sleep(2);

            luckyItems.add("장 미 꽃 다 발");
            luckyItems.add("황 금 열 쇠");
            luckyItems.add("복 권");
            luckyItems.add("영 양 제");
            luckyItems.add("손 수 건");
            luckyItems.add("부 채");
            luckyItems.add("이 어 폰");
            luckyItems.add("리 모 콘");
            luckyItems.add("펜");

            randomIndex = (int) (Math.random() * luckyItems.size());
            LuckyItemPrint(Integer.parseInt(luckyItems.get(randomIndex))); // 랜덤 인덱스에서 받은 정수를 문자열로 변환
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void LuckyColor() {
        ArrayList<String> luckyColors = new ArrayList<>();
        try {
            TimeUnit.SECONDS.sleep(2);

            luckyColors.add("R E D");
            luckyColors.add("B L U E");
            luckyColors.add("Y E L L O W");
            luckyColors.add("P U R P L E");
            luckyColors.add("G R E E N");
            luckyColors.add("O R A N G E");

            randomIndex = (int) (Math.random() * luckyColors.size());
            LuckyItemPrint(Integer.parseInt(luckyColors.get(randomIndex))); // 랜덤 인덱스에서 받은 정수를 문자열로 변환
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void LuckyNumber() {
        try {
            TimeUnit.SECONDS.sleep(2);
            // 1부터 100까지의 무작위 숫자 생성
            randomIndex = (int) (Math.random() * 100) + 1;
            LuckyItemPrint(randomIndex);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void LuckyItemPrint(int thing){
        System.out.println(".･ ｡ ⊹ + ஐ ஐ ஐ " + thing +" ஐ ஐ ஐ + ⊹ ｡ ･." + "\n");
    }
}
