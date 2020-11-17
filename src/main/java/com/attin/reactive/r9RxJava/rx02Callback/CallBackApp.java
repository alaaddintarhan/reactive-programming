package com.attin.reactive.r9RxJava.rx02Callback;

public class CallBackApp {

    public static void main(String[] args) {
        System.out.println("Main Thread is  started.");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                new CallBackApp().runningAsysc(new Callback() {
                    @Override
                    public void call() {
                        System.out.println(" Callback called..!");
                    }
                });
            }
        };

        Thread thread = new Thread(runnable);
        thread.run();

        System.out.println("Main Thread is  stopped.");
    }

    private void runningAsysc(Callback callback) {
        System.out.println("I m running in saperate thread.");
        sleep(1000);
        callback.call();
    }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
