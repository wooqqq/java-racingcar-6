package racingcar.Controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Service.GameService;

import java.util.List;

public class GameController {
    private final GameService gameService = new GameService();

    public void startGame() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carName = Console.readLine();
        List<String> carList = gameService.parseCarName(carName);

        System.out.println("시도할 회수는 몇회인가요?");
        String countTrial = Console.readLine();

        System.out.println(carList);
    }
}
