package org.multithreading.service.model.runnableImpl;

import org.multithreading.service.model.PhoneService;

public class RunnableImplViber implements Runnable {
    @Override
    public void run() {
        new PhoneService().viberCall();
    }
}
