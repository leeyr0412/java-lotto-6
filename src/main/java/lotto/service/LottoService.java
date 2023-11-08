package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.Lotto;
import lotto.domain.PrizeNumber;
import lotto.domain.UserLotto;

import java.util.Collections;
import java.util.List;

public class LottoService {

    public UserLotto getLotto(int lottoCount) {
        UserLotto userLotto = new UserLotto();
        for (int i = 0; i < lottoCount; i++) {
            userLotto.insertLotto(generateLottoNumber());
        }
        return userLotto;
    }

    public Lotto generateLottoNumber() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        Collections.sort(numbers);
        System.out.println(numbers.toString());
        return new Lotto(numbers);
    }

    public PrizeNumber setPrizeNumber(){

    }
}
// TODO: 2023-11-08 backup