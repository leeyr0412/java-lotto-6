package lotto.domain;

import camp.nextstep.edu.missionutils.Console;

public class Money {
    private int money;

    public Money() {
    }

    private String input() {
        System.out.println("구입금액을 입력해 주세요.");
        return Console.readLine();
    }

    public int inputMoney() {
        while (true) {
            try {
                numberValidation(input());
                priceVerification();
                System.out.println("\n" + this.money / 1000 + "개를 구매했습니다.");
                return this.money / 1000;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void numberValidation(String userInput) {
        try {
            this.money = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자만 입력하세요.\n");
        }
    }

    public void priceVerification() {
        if (this.money % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 1000원 단위로만 구매 가능합니다.\n");
        }
    }
}
