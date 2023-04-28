package p112g2;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p074e2.AbstractC6608c0;
import p074e2.C6629i1;
import p074e2.C6639l;

/* renamed from: g2.j */
/* loaded from: classes.dex */
public class C7410j {

    /* renamed from: a */
    private AbstractC7395b f15967a;

    /* renamed from: b */
    private ScheduledFuture f15968b;

    /* renamed from: c */
    private String f15969c;

    /* renamed from: d */
    private Runnable f15970d;

    /* renamed from: e */
    private AbstractC6608c0 f15971e = C6639l.m24863j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2.j$a */
    /* loaded from: classes.dex */
    public class RunnableC7411a implements Runnable {
        RunnableC7411a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7410j.this.f15971e.mo24880g("%s fired", C7410j.this.f15969c);
            C7410j.this.f15970d.run();
            C7410j.this.f15968b = null;
        }
    }

    public C7410j(Runnable runnable, String str) {
        this.f15969c = str;
        this.f15967a = new C7401e(str, true);
        this.f15970d = runnable;
    }

    /* renamed from: f */
    private void m22721f(boolean z) {
        ScheduledFuture scheduledFuture = this.f15968b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z);
        }
        this.f15968b = null;
        this.f15971e.mo24880g("%s canceled", this.f15969c);
    }

    /* renamed from: e */
    public void m22722e() {
        m22721f(false);
    }

    /* renamed from: g */
    public long m22720g() {
        ScheduledFuture scheduledFuture = this.f15968b;
        if (scheduledFuture == null) {
            return 0L;
        }
        return scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    public void m22719h(long j) {
        m22721f(false);
        this.f15971e.mo24880g("%s starting. Launching in %s seconds", this.f15969c, C6629i1.f13988a.format(j / 1000.0d));
        this.f15968b = this.f15967a.mo22737c(new RunnableC7411a(), j);
    }

    /* renamed from: i */
    public void m22718i() {
        m22721f(true);
        AbstractC7395b bVar = this.f15967a;
        if (bVar != null) {
            bVar.mo22739a();
        }
        this.f15967a = null;
    }
}
