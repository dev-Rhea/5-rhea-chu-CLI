package LuckyItemRecommendation;

public interface LuckyItemQuestion {
    public void TodayWeather();
    public void TodayFeelings();
    public void GoingWhere();
    public void AloneOrNot();
    public void LuckyPrint();
    public void ErrorMsg();
    public int UserInputHandler(String[] options, String message, int maxChoice);
}
