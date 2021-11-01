package org.multithreading.service.model.synchronizers;

import org.multithreading.service.model.locks.LockUtil;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    private static final CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() {
        LockUtil.sleep(2L);
        System.out.println("Market staff come to work");
        countDownLatch.countDown();
        System.out.println("countDonLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() {
        LockUtil.sleep(3L);
        System.out.println("Everything is ready, so let's open market!");
        countDownLatch.countDown();
        System.out.println("countDonLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() {
        LockUtil.sleep(4L);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDonLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) {
        new Friend("Max", countDownLatch);
        new Friend("Ivan", countDownLatch);
        new Friend("Chuck", countDownLatch);
        new Friend("Jack", countDownLatch);
        new Friend("Sam", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}
