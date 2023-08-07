package com.discord.misc.utilities.threading;

import android.os.Handler;
import android.os.Looper;
import jf.n;
import jf.p;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a'\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0086\bø\u0001\u0000\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002\"\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"isOnMainThread", "", "()Z", "uiHandler", "Landroid/os/Handler;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler$delegate", "Lkotlin/Lazy;", "assertOnUiThread", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "postOrRunOnMainThread", "", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ThreadUtilsKt {
    private static final Lazy uiHandler$delegate;

    static {
        Lazy a10;
        a10 = n.a(p.PUBLICATION, ThreadUtilsKt$uiHandler$2.INSTANCE);
        uiHandler$delegate = a10;
    }

    public static final <T> T assertOnUiThread(Function0<? extends T> block) {
        q.h(block, "block");
        if (isOnMainThread()) {
            return (T) block.invoke();
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public static final Handler getUiHandler() {
        return (Handler) uiHandler$delegate.getValue();
    }

    public static final boolean isOnMainThread() {
        return q.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final void postOrRunOnMainThread(final Function0<Unit> block) {
        q.h(block, "block");
        if (isOnMainThread()) {
            block.invoke();
        } else {
            getUiHandler().post(new Runnable() { 
                @Override 
                public final void run() {
                    block.invoke();
                }
            });
        }
    }
}
