package strategy.presentation;

import strategy.domain.*;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Strategy comma = new CommaSeparatedStrategy();
        Strategy semicolon = new SemicolonSeparatedStrategy();
        StrategyServiceImpl service = new StrategyServiceImpl(new CommaSeparatedStrategy());
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cde");
        System.out.println(comma.process(list));
        System.out.println(semicolon.process(list));
        System.out.println(service.exec(list));
    }
}