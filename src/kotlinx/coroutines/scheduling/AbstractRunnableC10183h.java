package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, m15073d2 = {"Lkotlinx/coroutines/scheduling/h;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "k", "J", "submissionTime", "Lkotlinx/coroutines/scheduling/i;", "l", "Lkotlinx/coroutines/scheduling/i;", "taskContext", "<init>", "(JLkotlinx/coroutines/scheduling/i;)V", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.h */
/* loaded from: classes8.dex */
public abstract class AbstractRunnableC10183h implements Runnable {

    /* renamed from: k */
    public long f22412k;

    /* renamed from: l */
    public AbstractC10184i f22413l;

    public AbstractRunnableC10183h(long j, AbstractC10184i iVar) {
        this.f22412k = j;
        this.f22413l = iVar;
    }

    public AbstractRunnableC10183h() {
        this(0L, C10187l.f22421f);
    }
}
