package racingcar;

import java.util.List;

public class Validator {
    private static final int CAR_NAME_MAX_LENGTH = 5;
    private static final int CAR_NAME_MIN_LENGTH = 1;

    public void checkCarName(List<String> carNames) {
        for (String carName : carNames) {
            checkCarNameMaxLength(carName);
            checkCarNameMinLength(carName);
        }
    }

    private void checkCarNameMaxLength(String carName) {
        if (carName.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    private void checkCarNameMinLength(String carName) {
        if (carName.length() < CAR_NAME_MIN_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 1자 이상만 가능합니다.");
        }
    }
}
