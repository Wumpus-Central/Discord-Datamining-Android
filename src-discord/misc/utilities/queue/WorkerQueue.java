package com.discord.misc.utilities.queue;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/misc/utilities/queue/WorkerQueue;", "T", "", "popFromEnd", "", "(Z)V", "currWorker", "Ljava/lang/Object;", "nextWorkers", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "updateWorker", "worker", AppStateModule.APP_STATE_ACTIVE, "onWorkerActive", "Lkotlin/Function1;", "", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Z", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class WorkerQueue<T> {
    private T currWorker;
    private final LinkedHashSet<T> nextWorkers;
    private final boolean popFromEnd;

    public WorkerQueue() {
        this(false, 1, null);
    }

    public WorkerQueue(boolean z10) {
        this.popFromEnd = z10;
        this.nextWorkers = new LinkedHashSet<>();
    }

    public final boolean updateWorker(T t10, boolean z10, Function1<? super T, Unit> onWorkerActive) {
        Object obj;
        Object U;
        Object g02;
        q.h(onWorkerActive, "onWorkerActive");
        if (z10) {
            T t11 = this.currWorker;
            if (t11 == null || q.c(t11, t10)) {
                this.currWorker = t10;
            } else {
                this.nextWorkers.add(t10);
            }
        } else if (q.c(this.currWorker, t10)) {
            if (this.popFromEnd) {
                g02 = r.g0(this.nextWorkers);
                obj = (T) g02;
            } else {
                U = r.U(this.nextWorkers);
                obj = (T) U;
            }
            this.currWorker = (T) obj;
            if (obj != null) {
                onWorkerActive.invoke(obj);
                this.nextWorkers.remove(obj);
            }
        } else {
            this.nextWorkers.remove(t10);
        }
        return q.c(this.currWorker, t10);
    }

    public  WorkerQueue(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
