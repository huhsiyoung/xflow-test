package com.test.message;

public abstract class Message {
    static int count;
    String id;
    long creationTime;

    Message() {
        count++;
        id = getClass().getSimpleName() + count;
        creationTime = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public int getCount() {
        return count;
    }
}
