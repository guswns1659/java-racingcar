import racingcar.Prompt;

public class FormulaRacing {
    public static void main(String[] args) {
        String[] cars = Prompt.ask("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분)");
        int maxAttempts = Prompt.askAttempt("시도할 횟수는 몇 번인가요?");

//        RacingController.start(new Rule(countOfCar, maxAttempts));
    }
}
