package org.multithreading.service.model;

import org.multithreading.service.model.runnableImpl.RunnableImplMobile;
import org.multithreading.service.model.runnableImpl.RunnableImplTelegram;
import org.multithreading.service.model.runnableImpl.RunnableImplViber;

public class PhoneService {
    static final Object lock = new Object();

    public void mobileCall()  {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Call ends");
        }
    }

    public void telegramCall()  {
        synchronized (lock) {
            System.out.println("Telegram call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Call ends");
        }
    }

    public void viberCall() {
        synchronized (lock) {
            System.out.println("Viber call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Call ends");
        }
    }

    public static void main(String[] args) {
        Thread threadMobile = new Thread(new RunnableImplMobile());
        Thread threadTelegram = new Thread(new RunnableImplTelegram());
        Thread threadViber = new Thread(new RunnableImplViber());

        threadMobile.start();
        threadTelegram.start();
        threadViber.start();
    }
}
