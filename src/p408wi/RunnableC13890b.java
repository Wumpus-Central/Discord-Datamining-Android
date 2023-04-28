package p408wi;

import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuation;
import nf.C11090s;
import nf.C11093t;
import p120gc.AbstractFutureC7576b;
import p120gc.C7578d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003B#\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m15073d2 = {"Lwi/b;", "T", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "Lgc/b;", "k", "Lgc/b;", "getFutureToObserve", "()Lgc/b;", "futureToObserve", "Lkotlinx/coroutines/CancellableContinuation;", "l", "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "continuation", "<init>", "(Lgc/b;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-guava"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: wi.b */
/* loaded from: classes8.dex */
public final class RunnableC13890b<T> implements Runnable {

    /* renamed from: k */
    private final AbstractFutureC7576b<T> f31319k;

    /* renamed from: l */
    private final CancellableContinuation<T> f31320l;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC13890b(AbstractFutureC7576b<T> bVar, CancellableContinuation<? super T> cancellableContinuation) {
        this.f31319k = bVar;
        this.f31320l = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable c;
        if (this.f31319k.isCancelled()) {
            CancellableContinuation.C9994a.m14574a(this.f31320l, null, 1, null);
            return;
        }
        try {
            CancellableContinuation<T> cancellableContinuation = this.f31320l;
            C11090s.C11091a aVar = C11090s.f24606l;
            cancellableContinuation.resumeWith(C11090s.m10940b(C7578d.m21973a(this.f31319k)));
        } catch (ExecutionException e) {
            CancellableContinuation<T> cancellableContinuation2 = this.f31320l;
            C11090s.C11091a aVar2 = C11090s.f24606l;
            c = C13889a.m2378c(e);
            cancellableContinuation2.resumeWith(C11090s.m10940b(C11093t.m10931a(c)));
        }
    }
}
