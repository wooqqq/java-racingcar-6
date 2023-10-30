package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;
import racingcar.service.GameService;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final GameService gameService = new GameService();

    public void startGame() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carName = Console.readLine();
        List<String> carList = gameService.parseCarName(carName);
        saveCars(carList);

        System.out.println("시도할 회수는 몇회인가요?");
        String countTrial = Console.readLine();

        System.out.println(carList);
    }

    private void saveCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }
    }
}