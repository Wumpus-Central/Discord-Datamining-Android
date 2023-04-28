package p112g2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

/* renamed from: g2.a */
/* loaded from: classes.dex */
public abstract class AbstractC7394a<Params, Result> {

    /* renamed from: g2.a$a */
    /* loaded from: classes.dex */
    class RunnableC0229a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Object[] f15934k;

        /* renamed from: l */
        final /* synthetic */ Handler f15935l;

        /* renamed from: g2.a$a$a */
        /* loaded from: classes.dex */
        class RunnableC0230a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ Object f15937k;

            RunnableC0230a(Object obj) {
                this.f15937k = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                AbstractC7394a.this.mo22747c(this.f15937k);
            }
        }

        RunnableC0229a(Object[] objArr, Handler handler) {
            this.f15934k = objArr;
            this.f15935l = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f15935l.post(new RunnableC0230a(AbstractC7394a.this.mo22749a(this.f15934k)));
        }
    }

    /* renamed from: a */
    protected abstract Result mo22749a(Params[] paramsArr);

    @SafeVarargs
    /* renamed from: b */
    public final AbstractC7394a<Params, Result> m22748b(Params... paramsArr) {
        m22746d();
        Executors.newSingleThreadExecutor().execute(new RunnableC0229a(paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    /* renamed from: c */
    protected void mo22747c(Result result) {
    }

    /* renamed from: d */
    protected void m22746d() {
    }
}
