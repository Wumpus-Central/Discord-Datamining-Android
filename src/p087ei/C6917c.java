package p087ei;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

/* renamed from: ei.c */
/* loaded from: classes8.dex */
public final class C6917c extends C6918d {

    /* renamed from: c */
    private final Runnable f15062c;

    /* renamed from: d */
    private final Function1<InterruptedException, Unit> f15063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6917c(Lock lock, Runnable checkCancelled, Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        super(lock);
        C9971q.m14633g(lock, "lock");
        C9971q.m14633g(checkCancelled, "checkCancelled");
        C9971q.m14633g(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f15062c = checkCancelled;
        this.f15063d = interruptedExceptionHandler;
    }

    @Override // p087ei.C6918d, p087ei.AbstractC6940k
    public void lock() {
        while (!m23941a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f15062c.run();
            } catch (InterruptedException e) {
                this.f15063d.invoke(e);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6917c(Runnable checkCancelled, Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        C9971q.m14633g(checkCancelled, "checkCancelled");
        C9971q.m14633g(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
