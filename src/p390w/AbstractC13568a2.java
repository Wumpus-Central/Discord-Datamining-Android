package p390w;

import java.util.concurrent.Executor;
import p120gc.AbstractFutureC7576b;

/* renamed from: w.a2 */
/* loaded from: classes.dex */
public interface AbstractC13568a2<T> {

    /* renamed from: w.a2$a */
    /* loaded from: classes.dex */
    public interface AbstractC13569a<T> {
        /* renamed from: a */
        void mo3341a(T t);

        void onError(Throwable th2);
    }

    /* renamed from: b */
    void mo3078b(Executor executor, AbstractC13569a<? super T> aVar);

    /* renamed from: c */
    AbstractFutureC7576b<T> mo3077c();

    /* renamed from: d */
    void mo3076d(AbstractC13569a<? super T> aVar);
}
