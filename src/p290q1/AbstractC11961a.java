package p290q1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.p018os.C2457s;
import androidx.core.util.C2520j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public abstract class AbstractC11961a<D> extends C11962b<D> {

    /* renamed from: i */
    private final Executor f26769i;

    /* renamed from: j */
    volatile AbstractC11961a<D>.RunnableC0378a f26770j;

    /* renamed from: k */
    volatile AbstractC11961a<D>.RunnableC0378a f26771k;

    /* renamed from: l */
    long f26772l;

    /* renamed from: m */
    long f26773m;

    /* renamed from: n */
    Handler f26774n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1.a$a */
    /* loaded from: classes.dex */
    public final class RunnableC0378a extends AbstractC11964c<Void, Void, D> implements Runnable {

        /* renamed from: u */
        private final CountDownLatch f26775u = new CountDownLatch(1);

        /* renamed from: v */
        boolean f26776v;

        RunnableC0378a() {
        }

        @Override // p290q1.AbstractC11964c
        /* renamed from: h */
        protected void mo8100h(D d) {
            try {
                AbstractC11961a.this.m8133x(this, d);
            } finally {
                this.f26775u.countDown();
            }
        }

        @Override // p290q1.AbstractC11964c
        /* renamed from: i */
        protected void mo8099i(D d) {
            try {
                AbstractC11961a.this.m8132y(this, d);
            } finally {
                this.f26775u.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: n */
        public D mo8106b(Void... voidArr) {
            try {
                return (D) AbstractC11961a.this.m8135C();
            } catch (C2457s e) {
                if (m8102f()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26776v = false;
            AbstractC11961a.this.m8131z();
        }
    }

    public AbstractC11961a(Context context) {
        this(context, AbstractC11964c.f26788r);
    }

    /* renamed from: A */
    public abstract D mo6640A();

    /* renamed from: B */
    public void m8136B(D d) {
    }

    /* renamed from: C */
    protected D m8135C() {
        return mo6640A();
    }

    @Override // p290q1.C11962b
    @Deprecated
    /* renamed from: g */
    public void mo8123g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo8123g(str, fileDescriptor, printWriter, strArr);
        if (this.f26770j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f26770j);
            printWriter.print(" waiting=");
            printWriter.println(this.f26770j.f26776v);
        }
        if (this.f26771k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f26771k);
            printWriter.print(" waiting=");
            printWriter.println(this.f26771k.f26776v);
        }
        if (this.f26772l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C2520j.m37581c(this.f26772l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C2520j.m37582b(this.f26773m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p290q1.C11962b
    /* renamed from: k */
    protected boolean mo8119k() {
        if (this.f26770j == null) {
            return false;
        }
        if (!this.f26781d) {
            this.f26784g = true;
        }
        if (this.f26771k != null) {
            if (this.f26770j.f26776v) {
                this.f26770j.f26776v = false;
                this.f26774n.removeCallbacks(this.f26770j);
            }
            this.f26770j = null;
            return false;
        } else if (this.f26770j.f26776v) {
            this.f26770j.f26776v = false;
            this.f26774n.removeCallbacks(this.f26770j);
            this.f26770j = null;
            return false;
        } else {
            boolean a = this.f26770j.m8107a(false);
            if (a) {
                this.f26771k = this.f26770j;
                m8134w();
            }
            this.f26770j = null;
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p290q1.C11962b
    /* renamed from: m */
    public void mo8117m() {
        super.mo8117m();
        m8128b();
        this.f26770j = new RunnableC0378a();
        m8131z();
    }

    /* renamed from: w */
    public void m8134w() {
    }

    /* renamed from: x */
    void m8133x(AbstractC11961a<D>.RunnableC0378a aVar, D d) {
        m8136B(d);
        if (this.f26771k == aVar) {
            m8112s();
            this.f26773m = SystemClock.uptimeMillis();
            this.f26771k = null;
            m8125e();
            m8131z();
        }
    }

    /* renamed from: y */
    void m8132y(AbstractC11961a<D>.RunnableC0378a aVar, D d) {
        if (this.f26770j != aVar) {
            m8133x(aVar, d);
        } else if (m8121i()) {
            m8136B(d);
        } else {
            m8127c();
            this.f26773m = SystemClock.uptimeMillis();
            this.f26770j = null;
            m8124f(d);
        }
    }

    /* renamed from: z */
    void m8131z() {
        if (this.f26771k == null && this.f26770j != null) {
            if (this.f26770j.f26776v) {
                this.f26770j.f26776v = false;
                this.f26774n.removeCallbacks(this.f26770j);
            }
            if (this.f26772l <= 0 || SystemClock.uptimeMillis() >= this.f26773m + this.f26772l) {
                this.f26770j.m8105c(this.f26769i, null);
                return;
            }
            this.f26770j.f26776v = true;
            this.f26774n.postAtTime(this.f26770j, this.f26773m + this.f26772l);
        }
    }

    private AbstractC11961a(Context context, Executor executor) {
        super(context);
        this.f26773m = -10000L;
        this.f26769i = executor;
    }
}
