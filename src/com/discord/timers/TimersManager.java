package com.discord.timers;

import android.content.Context;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9677q;
import p164j$.util.concurrent.ConcurrentHashMap;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u001b"}, m15073d2 = {"Lcom/discord/timers/TimersManager;", "", "", "id", "", "timeout", "Lkotlin/Function0;", "", "onTimeout", "setTimeout", "clearTimeout", "onInterval", "setInterval", "clearInterval", "clean", "Landroid/os/Handler;", "timeoutHandler", "Landroid/os/Handler;", "j$/util/concurrent/ConcurrentHashMap", "Ljava/lang/Runnable;", "timeouts", "Lj$/util/concurrent/ConcurrentHashMap;", "intervals", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react_timers_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class TimersManager {
    private final Handler timeoutHandler;
    private final ConcurrentHashMap<Integer, Runnable> timeouts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Runnable> intervals = new ConcurrentHashMap<>();

    public TimersManager(Context context) {
        C9677q.m14633g(context, "context");
        this.timeoutHandler = new Handler(context.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTimeout$lambda$0(TimersManager this$0, int i, Function0 onTimeout) {
        C9677q.m14633g(this$0, "this$0");
        C9677q.m14633g(onTimeout, "$onTimeout");
        this$0.timeouts.remove(Integer.valueOf(i));
        onTimeout.invoke();
    }

    public final void clean() {
        this.timeoutHandler.removeCallbacksAndMessages(null);
        this.timeouts.clear();
        this.intervals.clear();
    }

    public final void clearInterval(int i) {
        Runnable remove = this.intervals.remove(Integer.valueOf(i));
        if (remove != null) {
            this.timeoutHandler.removeCallbacks(remove);
        }
    }

    public final void clearTimeout(int i) {
        Runnable remove = this.timeouts.remove(Integer.valueOf(i));
        if (remove != null) {
            this.timeoutHandler.removeCallbacks(remove);
        }
    }

    public final void setInterval(int i, double d, final Function0<Unit> onInterval) {
        C9677q.m14633g(onInterval, "onInterval");
        final long j = (long) d;
        Runnable timersManager$setInterval$runnable$1 = new Runnable() { // from class: com.discord.timers.TimersManager$setInterval$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler;
                onInterval.invoke();
                handler = this.timeoutHandler;
                handler.postDelayed(this, j);
            }
        };
        this.intervals.put(Integer.valueOf(i), timersManager$setInterval$runnable$1);
        this.timeoutHandler.postDelayed(timersManager$setInterval$runnable$1, j);
    }

    public final void setTimeout(final int i, double d, final Function0<Unit> onTimeout) {
        C9677q.m14633g(onTimeout, "onTimeout");
        Runnable aVar = new Runnable() { // from class: com.discord.timers.a
            @Override // java.lang.Runnable
            public final void run() {
                TimersManager.setTimeout$lambda$0(TimersManager.this, i, onTimeout);
            }
        };
        this.timeouts.put(Integer.valueOf(i), aVar);
        this.timeoutHandler.postDelayed(aVar, (long) d);
    }
}
