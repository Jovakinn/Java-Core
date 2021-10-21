package org.multithreading.service.model.runnableImpl;

import org.multithreading.service.model.PhoneService;

public class RunnableImplTelegram implements Runnable {
    @Override
    public void run() {
        new PhoneService().telegramCall();
    }
}
