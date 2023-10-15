package com.test.node;

import java.net.Socket;

public abstract class ActiveNode extends Node implements Runnable {
    protected long startTime;
    protected Thread thread;
    protected long interval = 1000;

    public ActiveNode(String name) {
        super(name);
        thread = new Thread(this, name); // 매개 변수로 2개를 받는 이유 모름
    }

    public void setInterval(int inteval) {
        this.interval = interval;
    }

    public void start() {
        startTime = System.currentTimeMillis();
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }

    public void run(Socket socket) {
        preprocess();

        long startTime = System.currentTimeMillis();
        long previousTime = startTime;

        while(thread.isAlive()) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - previousTime; // 흐른 시간 = 현재 시간 - 
            if (elapsedTime < interval) { // 
                try {
                    process();
                    Thread.sleep(interval - elapsedTime);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        postprocess();
    }

    abstract void preprocess();

    abstract void process();

    abstract void postprocess();


}
