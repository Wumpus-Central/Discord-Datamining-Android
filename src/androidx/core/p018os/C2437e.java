package androidx.core.p018os;

import android.os.CancellationSignal;

/* renamed from: androidx.core.os.e */
/* loaded from: classes.dex */
public final class C2437e {

    /* renamed from: a */
    private boolean f3370a;

    /* renamed from: b */
    private AbstractC2439b f3371b;

    /* renamed from: c */
    private Object f3372c;

    /* renamed from: d */
    private boolean f3373d;

    /* renamed from: androidx.core.os.e$a */
    /* loaded from: classes.dex */
    static class C2438a {
        /* renamed from: a */
        static void m37741a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m37740b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.e$b */
    /* loaded from: classes.dex */
    public interface AbstractC2439b {
        void onCancel();
    }

    /* renamed from: d */
    private void m37742d() {
        while (this.f3373d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m37745a() {
        synchronized (this) {
            if (!this.f3370a) {
                this.f3370a = true;
                this.f3373d = true;
                AbstractC2439b bVar = this.f3371b;
                Object obj = this.f3372c;
                if (bVar != null) {
                    try {
                        bVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f3373d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    C2438a.m37741a(obj);
                }
                synchronized (this) {
                    this.f3373d = false;
                    notifyAll();
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m37744b() {
        boolean z;
        synchronized (this) {
            z = this.f3370a;
        }
        return z;
    }

    /* renamed from: c */
    public void m37743c(AbstractC2439b bVar) {
        synchronized (this) {
            m37742d();
            if (this.f3371b != bVar) {
                this.f3371b = bVar;
                if (this.f3370a && bVar != null) {
                    bVar.onCancel();
                }
            }
        }
    }
}
