package lotto.domain;

import lotto.Lotto;

import java.util.ArrayList;
import java.util.List;

public class UserLotto {

    private List<Lotto> userLottos;

    public UserLotto() {
        this.userLottos = new ArrayList<>();
    }

    public void insertLotto(Lotto lotto) {
        this.userLottos.add(lotto);
    }
}
