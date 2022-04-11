package racingcar;

import java.util.Scanner;

public class Prompt {
    private static final Scanner scanner = new Scanner(System.in);

    public static String[] ask(String question) {
        System.out.println(question);
        String input;
        input = scanner.nextLine();
        if (input.isBlank()) {
            System.out.println("입력 값은 빈 값이 안됩니다. 다시 입력 해주세요.");
            input = scanner.nextLine();
        }
        return input.split(",");
    }

    public static int askAttempt(String question) {
        return 0;
    }
}
