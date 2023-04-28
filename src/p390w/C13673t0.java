package p390w;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13568a2;
import p431y.C14186f;

/* renamed from: w.t0 */
/* loaded from: classes.dex */
public final class C13673t0<T> implements AbstractC13568a2<T> {

    /* renamed from: b */
    private static final C13673t0<Object> f30544b = new C13673t0<>(null);

    /* renamed from: a */
    private final AbstractFutureC7576b<T> f30545a;

    private C13673t0(T t) {
        this.f30545a = C14186f.m1421h(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m3082f(AbstractC13568a2.AbstractC13569a aVar) {
        try {
            aVar.mo3341a(this.f30545a.get());
        } catch (InterruptedException | ExecutionException e) {
            aVar.onError(e);
        }
    }

    /* renamed from: g */
    public static <U> AbstractC13568a2<U> m3081g(U u) {
        if (u == null) {
            return f30544b;
        }
        return new C13673t0(u);
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: b */
    public void mo3078b(Executor executor, final AbstractC13568a2.AbstractC13569a<? super T> aVar) {
        this.f30545a.mo1409a(new Runnable() { // from class: w.s0
            @Override // java.lang.Runnable
            public final void run() {
                C13673t0.this.m3082f(aVar);
            }
        }, executor);
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: c */
    public AbstractFutureC7576b<T> mo3077c() {
        return this.f30545a;
    }

    @Override // p390w.AbstractC13568a2
    /* renamed from: d */
    public void mo3076d(AbstractC13568a2.AbstractC13569a<? super T> aVar) {
    }
}
