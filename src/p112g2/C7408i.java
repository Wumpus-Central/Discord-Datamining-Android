package p112g2;

import java.text.DecimalFormat;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p074e2.AbstractC6608c0;
import p074e2.C6629i1;
import p074e2.C6639l;

/* renamed from: g2.i */
/* loaded from: classes.dex */
public class C7408i {

    /* renamed from: a */
    private AbstractC7395b f15958a;

    /* renamed from: b */
    private ScheduledFuture f15959b;

    /* renamed from: c */
    private String f15960c;

    /* renamed from: d */
    private Runnable f15961d;

    /* renamed from: e */
    private long f15962e;

    /* renamed from: f */
    private long f15963f;

    /* renamed from: g */
    private boolean f15964g = true;

    /* renamed from: h */
    private AbstractC6608c0 f15965h = C6639l.m24863j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2.i$a */
    /* loaded from: classes.dex */
    public class RunnableC7409a implements Runnable {
        RunnableC7409a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7408i.this.f15965h.mo24880g("%s fired", C7408i.this.f15960c);
            C7408i.this.f15961d.run();
        }
    }

    public C7408i(Runnable runnable, long j, long j2, String str) {
        this.f15958a = new C7401e(str, true);
        this.f15960c = str;
        this.f15961d = runnable;
        this.f15962e = j;
        this.f15963f = j2;
        DecimalFormat decimalFormat = C6629i1.f13988a;
        String format = decimalFormat.format(j2 / 1000.0d);
        this.f15965h.mo24880g("%s configured to fire after %s seconds of starting and cycles every %s seconds", str, decimalFormat.format(j / 1000.0d), format);
    }

    /* renamed from: d */
    private void m22730d(boolean z) {
        ScheduledFuture scheduledFuture = this.f15959b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z);
        }
        this.f15959b = null;
    }

    /* renamed from: e */
    public void m22729e() {
        if (!this.f15964g) {
            this.f15965h.mo24880g("%s is already started", this.f15960c);
            return;
        }
        this.f15965h.mo24880g("%s starting", this.f15960c);
        this.f15959b = this.f15958a.mo22738b(new RunnableC7409a(), this.f15962e, this.f15963f);
        this.f15964g = false;
    }

    /* renamed from: f */
    public void m22728f() {
        if (this.f15964g) {
            this.f15965h.mo24880g("%s is already suspended", this.f15960c);
            return;
        }
        this.f15962e = this.f15959b.getDelay(TimeUnit.MILLISECONDS);
        this.f15959b.cancel(false);
        this.f15965h.mo24880g("%s suspended with %s seconds left", this.f15960c, C6629i1.f13988a.format(this.f15962e / 1000.0d));
        this.f15964g = true;
    }

    /* renamed from: g */
    public void m22727g() {
        m22730d(true);
        AbstractC7395b bVar = this.f15958a;
        if (bVar != null) {
            bVar.mo22739a();
        }
        this.f15958a = null;
    }
}
