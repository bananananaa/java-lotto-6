package lotto;

import static lotto.OutputView.printAmount;
import static lotto.OutputView.printBonus;
import static lotto.OutputView.printBuy;
import static lotto.OutputView.printDash;
import static lotto.OutputView.printNumbers;
import static lotto.OutputView.printResult;
import static lotto.OutputView.printStats;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LottoController {

    private LottoService lottoService;
    private List<Integer> matchingLotto;

    public LottoController() {
        lottoService = new LottoService();
    }

    public void start() {
        requestAmount();
        requestMyLotto();
        requestLotto();
        requestBonus();
        matchLotto();
        result();
        rateOfReturn();
    }

    private void requestAmount() {
        printAmount();
        lottoService.setAmount(Console.readLine());
    }

    private void requestLotto() {
        printNumbers();
        lottoService.setLotto(Console.readLine());
    }

    private void requestBonus() {
        printBonus();
        lottoService.setBonus(Console.readLine());
    }

    private void requestMyLotto() {
        printBuy(lottoService.numberOfPurchase());
        lottoService.setMyLotto();
    }

    private void matchLotto() {
        matchingLotto = lottoService.resultLotto();
    }

    private void result() {
        printStats();
        printDash();
        int match = 3;
        for (OutputLine outputLine : OutputLine.values()){
            if (match == 6) {
                System.out.printf(outputLine.getCorrect(), Collections.frequency(matchingLotto, 7));
                continue;
            }
            System.out.printf(outputLine.getCorrect(), Collections.frequency(matchingLotto, match++));
        }
    }

    private void rateOfReturn() {
        printResult(lottoService.rateReturn());
    }

}
