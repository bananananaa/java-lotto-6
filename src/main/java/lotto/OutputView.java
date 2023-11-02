package lotto;

public class OutputView {

    private static final String inputAmount = "구입금액을 입력해 주세요.";
    private static final String buy = "개를 구매했습니다.";
    private static final String inputNumbers = "당첨 번호를 입력해 주세요.";
    private static final String inputBonus = "보너스 번호를 입력해 주세요.";
    private static final String stats = "당첨 통계";
    private static final String dash = "---";
    private static final String result = "총 수익률은 ";

    public static void printAmount() {
        System.out.println(inputAmount);
    }

    public static void printBuy(int purchasesNumber) {
        System.out.println(purchasesNumber+buy);
    }

    public static void printNumbers(){
        System.out.println(inputNumbers);
    }

    public static void printBonus(){
        System.out.println(inputBonus);
    }

    public static void printStats() {
        System.out.println(stats);
    }

    public static void printDash() {
        System.out.println(dash);
    }

    public static void printResult(){
        System.out.println(result);
    }


}
