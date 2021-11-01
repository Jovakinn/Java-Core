package org.multithreading.service.model.synchronizers;

import org.multithreading.service.model.locks.LockUtil;

import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.logging.Logger;

public class BestFriend extends Thread {
    private static final Logger logger = Logger.getLogger(BestFriend.class.getName());

    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.STONE && friendAction == Action.SCISSORS)
        || (myAction == Action.SCISSORS && friendAction == Action.PAPER)
        || (myAction == Action.PAPER && friendAction == Action.STONE)) {
            logger.info(name + " WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action: myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                LockUtil.sleep(2L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
