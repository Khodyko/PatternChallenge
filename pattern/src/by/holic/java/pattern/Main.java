package by.holic.java.pattern;

import by.holic.java.pattern.strategy.Context;
import by.holic.java.pattern.strategy.Strategy1;
import by.holic.java.pattern.strategy.Strategy2;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Strategy1());
        context.doActionByStrategy();
        context.setStrategy(new Strategy2());
        context.doActionByStrategy();
    }
}