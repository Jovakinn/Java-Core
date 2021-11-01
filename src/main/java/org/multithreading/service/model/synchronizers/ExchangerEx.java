package org.multithreading.service.model.synchronizers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> friend1ActionList = new ArrayList<>();
        friend1ActionList.add(Action.SCISSORS);
        friend1ActionList.add(Action.PAPER);
        friend1ActionList.add(Action.SCISSORS);

        List<Action> friend2ActionList = new ArrayList<>();
        friend2ActionList.add(Action.PAPER);
        friend2ActionList.add(Action.STONE);
        friend2ActionList.add(Action.STONE);

        new BestFriend("Jack", friend1ActionList, exchanger);
        new BestFriend("John", friend2ActionList, exchanger);
    }
}
