package com.discord.async_init;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/async_init/AsyncInitThreadChecker;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "(Ljava/lang/String;)V", "thread", "Ljava/lang/Thread;", "checkIsOnValidThread", "", "detachThread", "async_init_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncInitThreadChecker {
    private final String name;
    private Thread thread;

    public AsyncInitThreadChecker(String name) {
        q.g(name, "name");
        this.name = name;
    }

    public final void checkIsOnValidThread() {
        if (this.thread == null) {
            this.thread = Thread.currentThread();
        }
        if (Thread.currentThread() != this.thread) {
            String str = this.name;
            Thread thread = this.thread;
            Thread currentThread = Thread.currentThread();
            throw new IllegalStateException(("Expected all calls to async-initialized component: " + str + " to be from the same thread: " + thread + ", called on " + currentThread).toString());
        }
    }

    public final void detachThread() {
        this.thread = null;
    }
}
