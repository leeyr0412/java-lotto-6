package lotto.controller;

import lotto.domain.Money;
import lotto.domain.UserLotto;
import lotto.service.LottoService;

public class LottoController {

    private final LottoService lottoService;


    public LottoController() {
        this.lottoService = new LottoService();
    }

    public void run() {
        Money money = new Money();
        int lottoCount = money.inputMoney();

        UserLotto userLotto = lottoService.getLotto(lottoCount);

        // TODO: 2023-11-07 당첨번호 입력하기


        // TODO: 2023-11-07 보너스 번호 입력하기


        // TODO: 2023-11-07 당첨 통계 출력

    }


}
