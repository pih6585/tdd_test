package multiplication.calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

import static multiplication.domain.ExceptionMessage.*;

public enum Calculation {
    PLUS("+", (a, b) -> a + b),
    MINUS("-", (a, b) -> a - b),
    MULTIPLE("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> {
        validToDivideByZero(b);
        return a / b;
    });

    private String expressionLabel;
    private BiFunction<Integer, Integer, Integer> calculateValue;

    Calculation(String expressionLabel, BiFunction<Integer, Integer, Integer> calculateValue) {
        this.expressionLabel = expressionLabel;
        this.calculateValue = calculateValue;
    }

    public static int calculateValue(String expressionLabel, int firstValue, int lastValue) {
        return getExpression(expressionLabel).calculateValue.apply(firstValue, lastValue);
    }

    private static Calculation getExpression(String expressionLabel) {
        return Arrays.stream(values())
                .filter(o -> o.expressionLabel.equals(expressionLabel))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(OPERATOR_ERROR_MESSAGE));
    }

    private static void validToDivideByZero(int lastValue) {
        if (lastValue == 0) {
            throw new IllegalArgumentException(DIVISION_ERROR_MESSAGE);
        }
    }

}
