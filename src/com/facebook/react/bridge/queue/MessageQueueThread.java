package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public interface MessageQueueThread {
    @AbstractC6709a
    void assertIsOnThread();

    @AbstractC6709a
    void assertIsOnThread(String str);

    @AbstractC6709a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @AbstractC6709a
    MessageQueueThreadPerfStats getPerfStats();

    @AbstractC6709a
    boolean isOnThread();

    @AbstractC6709a
    void quitSynchronous();

    @AbstractC6709a
    void resetPerfStats();

    @AbstractC6709a
    boolean runOnQueue(Runnable runnable);
}
