package lotto.service;

import lotto.domain.Money;

public class LottoService {

    public void run() {
        // TODO: 2023-11-07  구입 금액 입력받기
        Money money = new Money();
        int lottoCount = money.inputMoney();
        // TODO: 2023-11-07 금액만큼 로또 발급
        // TODO: 2023-11-07 당첨번호 입력하기
        // TODO: 2023-11-07 보너스 번호 입력하기
        // TODO: 2023-11-07 당첨 통계 출력
    }
}
