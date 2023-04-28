package com.discord.misc.utilities.queue;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m15073d2 = {"Lcom/discord/misc/utilities/queue/WorkerQueue;", "T", "", "popFromEnd", "", "(Z)V", "currWorker", "Ljava/lang/Object;", "nextWorkers", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "updateWorker", "worker", AppStateModule.APP_STATE_ACTIVE, "onWorkerActive", "Lkotlin/Function1;", "", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Z", "misc_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class WorkerQueue<T> {
    private T currWorker;
    private final LinkedHashSet<T> nextWorkers;
    private final boolean popFromEnd;

    public WorkerQueue() {
        this(false, 1, null);
    }

    public WorkerQueue(boolean z) {
        this.popFromEnd = z;
        this.nextWorkers = new LinkedHashSet<>();
    }

    public final boolean updateWorker(T t, boolean z, Function1<? super T, Unit> onWorkerActive) {
        Object obj;
        Object V;
        Object h0;
        C9971q.m14633g(onWorkerActive, "onWorkerActive");
        if (z) {
            T t2 = this.currWorker;
            if (t2 == null || C9971q.m14638b(t2, t)) {
                this.currWorker = t;
            } else {
                this.nextWorkers.add(t);
            }
        } else if (C9971q.m14638b(this.currWorker, t)) {
            if (this.popFromEnd) {
                h0 = C9914r.m14757h0(this.nextWorkers);
                obj = (T) h0;
            } else {
                V = C9914r.m14769V(this.nextWorkers);
                obj = (T) V;
            }
            this.currWorker = (T) obj;
            if (obj != null) {
                onWorkerActive.invoke(obj);
                this.nextWorkers.remove(obj);
            }
        } else {
            this.nextWorkers.remove(t);
        }
        return C9971q.m14638b(this.currWorker, t);
    }

    public /* synthetic */ WorkerQueue(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
