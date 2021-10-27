package org.multithreading.service.model.locksClasses;

public class Impl {
    public static void main(String[] args) {
        Call call = new Call();
        Thread mobileThread = new Thread(call::mobileCall);
        Thread viberThread = new Thread(call::viberCall);
        Thread telegramThread = new Thread(call::telegramCall);

        mobileThread.start();
        viberThread.start();
        telegramThread.start();
    }
}
