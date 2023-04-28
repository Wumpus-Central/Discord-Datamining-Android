package p288q;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.core.AbstractC1883m;
import androidx.camera.core.C1811g0;
import androidx.camera.core.C1829h0;
import androidx.camera.core.C1935v1;
import androidx.concurrent.futures.C2114c;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p120gc.AbstractFutureC7576b;
import p272p.C11502b;
import p288q.C11935w;
import p355u.C13169i;
import p390w.AbstractC13571b0;
import p390w.AbstractC13615k;
import p390w.AbstractC13672t;
import p390w.C13600g2;
import p390w.C13632m;
import p390w.C13639n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.h2 */
/* loaded from: classes.dex */
public class C11828h2 {

    /* renamed from: u */
    private static final MeteringRectangle[] f26386u = new MeteringRectangle[0];

    /* renamed from: a */
    private final C11935w f26387a;

    /* renamed from: b */
    final Executor f26388b;

    /* renamed from: c */
    private final ScheduledExecutorService f26389c;

    /* renamed from: f */
    private final C13169i f26392f;

    /* renamed from: i */
    private ScheduledFuture<?> f26395i;

    /* renamed from: p */
    private MeteringRectangle[] f26402p;

    /* renamed from: q */
    private MeteringRectangle[] f26403q;

    /* renamed from: r */
    private MeteringRectangle[] f26404r;

    /* renamed from: d */
    private volatile boolean f26390d = false;

    /* renamed from: e */
    private volatile Rational f26391e = null;

    /* renamed from: g */
    private boolean f26393g = false;

    /* renamed from: h */
    Integer f26394h = 0;

    /* renamed from: j */
    long f26396j = 0;

    /* renamed from: k */
    boolean f26397k = false;

    /* renamed from: l */
    boolean f26398l = false;

    /* renamed from: m */
    private int f26399m = 1;

    /* renamed from: n */
    private C11935w.AbstractC11938c f26400n = null;

    /* renamed from: o */
    private C11935w.AbstractC11938c f26401o = null;

    /* renamed from: s */
    C2114c.C2115a<C1829h0> f26405s = null;

    /* renamed from: t */
    C2114c.C2115a<Void> f26406t = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.h2$a */
    /* loaded from: classes.dex */
    public class C11829a extends AbstractC13615k {

        /* renamed from: a */
        final /* synthetic */ C2114c.C2115a f26407a;

        C11829a(C2114c.C2115a aVar) {
            this.f26407a = aVar;
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: a */
        public void mo3172a() {
            C2114c.C2115a aVar = this.f26407a;
            if (aVar != null) {
                aVar.m38958f(new AbstractC1883m.C1884a("Camera is closed"));
            }
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: b */
        public void mo3171b(AbstractC13672t tVar) {
            C2114c.C2115a aVar = this.f26407a;
            if (aVar != null) {
                aVar.m38961c(tVar);
            }
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: c */
        public void mo3170c(C13632m mVar) {
            C2114c.C2115a aVar = this.f26407a;
            if (aVar != null) {
                aVar.m38958f(new AbstractC13571b0.C13573b(mVar));
            }
        }
    }

    /* renamed from: q.h2$b */
    /* loaded from: classes.dex */
    class C11830b extends AbstractC13615k {

        /* renamed from: a */
        final /* synthetic */ C2114c.C2115a f26409a;

        C11830b(C2114c.C2115a aVar) {
            this.f26409a = aVar;
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: a */
        public void mo3172a() {
            C2114c.C2115a aVar = this.f26409a;
            if (aVar != null) {
                aVar.m38958f(new AbstractC1883m.C1884a("Camera is closed"));
            }
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: b */
        public void mo3171b(AbstractC13672t tVar) {
            C2114c.C2115a aVar = this.f26409a;
            if (aVar != null) {
                aVar.m38961c(null);
            }
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: c */
        public void mo3170c(C13632m mVar) {
            C2114c.C2115a aVar = this.f26409a;
            if (aVar != null) {
                aVar.m38958f(new AbstractC13571b0.C13573b(mVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11828h2(C11935w wVar, ScheduledExecutorService scheduledExecutorService, Executor executor, C13600g2 g2Var) {
        MeteringRectangle[] meteringRectangleArr = f26386u;
        this.f26402p = meteringRectangleArr;
        this.f26403q = meteringRectangleArr;
        this.f26404r = meteringRectangleArr;
        this.f26387a = wVar;
        this.f26388b = executor;
        this.f26389c = scheduledExecutorService;
        this.f26392f = new C13169i(g2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m8584A(final long j) {
        this.f26388b.execute(new Runnable() { // from class: q.d2
            @Override // java.lang.Runnable
            public final void run() {
                C11828h2.this.m8547z(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ Object m8582C(final C1811g0 g0Var, final C2114c.C2115a aVar) {
        this.f26388b.execute(new Runnable() { // from class: q.g2
            @Override // java.lang.Runnable
            public final void run() {
                C11828h2.this.m8583B(aVar, g0Var);
            }
        });
        return "startFocusAndMetering";
    }

    /* renamed from: D */
    private static int m8581D(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    /* renamed from: H */
    private boolean m8577H() {
        return this.f26402p.length > 0;
    }

    /* renamed from: k */
    private void m8562k(boolean z) {
        C2114c.C2115a<C1829h0> aVar = this.f26405s;
        if (aVar != null) {
            aVar.m38961c(C1829h0.m39704a(z));
            this.f26405s = null;
        }
    }

    /* renamed from: l */
    private void m8561l() {
        C2114c.C2115a<Void> aVar = this.f26406t;
        if (aVar != null) {
            aVar.m38961c(null);
            this.f26406t = null;
        }
    }

    /* renamed from: m */
    private void m8560m() {
        ScheduledFuture<?> scheduledFuture = this.f26395i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f26395i = null;
        }
    }

    /* renamed from: n */
    private void m8559n(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, C1811g0 g0Var) {
        final long j;
        this.f26387a.m8256a0(this.f26400n);
        m8560m();
        this.f26402p = meteringRectangleArr;
        this.f26403q = meteringRectangleArr2;
        this.f26404r = meteringRectangleArr3;
        if (m8577H()) {
            this.f26393g = true;
            this.f26397k = false;
            this.f26398l = false;
            j = this.f26387a.m8246j0();
            m8573L(null, true);
        } else {
            this.f26393g = false;
            this.f26397k = true;
            this.f26398l = false;
            j = this.f26387a.m8246j0();
        }
        this.f26394h = 0;
        final boolean v = m8551v();
        C11935w.AbstractC11938c b2Var = new C11935w.AbstractC11938c() { // from class: q.b2
            @Override // p288q.C11935w.AbstractC11938c
            /* renamed from: a */
            public final boolean mo3810a(TotalCaptureResult totalCaptureResult) {
                boolean y;
                y = C11828h2.this.m8548y(v, j, totalCaptureResult);
                return y;
            }
        };
        this.f26400n = b2Var;
        this.f26387a.m8235t(b2Var);
        if (g0Var.m39786e()) {
            final long j2 = this.f26396j + 1;
            this.f26396j = j2;
            this.f26395i = this.f26389c.schedule(new Runnable() { // from class: q.c2
                @Override // java.lang.Runnable
                public final void run() {
                    C11828h2.this.m8584A(j2);
                }
            }, g0Var.m39790a(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: o */
    private void m8558o(String str) {
        this.f26387a.m8256a0(this.f26400n);
        C2114c.C2115a<C1829h0> aVar = this.f26405s;
        if (aVar != null) {
            aVar.m38958f(new AbstractC1883m.C1884a(str));
            this.f26405s = null;
        }
    }

    /* renamed from: p */
    private void m8557p(String str) {
        this.f26387a.m8256a0(this.f26401o);
        C2114c.C2115a<Void> aVar = this.f26406t;
        if (aVar != null) {
            aVar.m38958f(new AbstractC1883m.C1884a(str));
            this.f26406t = null;
        }
    }

    /* renamed from: r */
    private Rational m8555r() {
        if (this.f26391e != null) {
            return this.f26391e;
        }
        Rect x = this.f26387a.m8231x();
        return new Rational(x.width(), x.height());
    }

    /* renamed from: s */
    private static PointF m8554s(C1935v1 v1Var, Rational rational, Rational rational2, int i, C13169i iVar) {
        if (v1Var.m39484b() != null) {
            rational2 = v1Var.m39484b();
        }
        PointF a = iVar.m4428a(v1Var, i);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                a.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + a.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                a.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + a.x) * (1.0f / doubleValue2);
            }
        }
        return a;
    }

    /* renamed from: t */
    private static MeteringRectangle m8553t(C1935v1 v1Var, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int a = ((int) (v1Var.m39485a() * rect.width())) / 2;
        int a2 = ((int) (v1Var.m39485a() * rect.height())) / 2;
        Rect rect2 = new Rect(width - a, height - a2, width + a, height + a2);
        rect2.left = m8581D(rect2.left, rect.right, rect.left);
        rect2.right = m8581D(rect2.right, rect.right, rect.left);
        rect2.top = m8581D(rect2.top, rect.bottom, rect.top);
        rect2.bottom = m8581D(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
    }

    /* renamed from: u */
    private List<MeteringRectangle> m8552u(List<C1935v1> list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (C1935v1 v1Var : list) {
            if (arrayList.size() == i) {
                break;
            } else if (m8550w(v1Var)) {
                MeteringRectangle t = m8553t(v1Var, m8554s(v1Var, rational2, rational, i2, this.f26392f), rect);
                if (!(t.getWidth() == 0 || t.getHeight() == 0)) {
                    arrayList.add(t);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: v */
    private boolean m8551v() {
        return this.f26387a.m8276G(1) == 1;
    }

    /* renamed from: w */
    private static boolean m8550w(C1935v1 v1Var) {
        return v1Var.m39483c() >= 0.0f && v1Var.m39483c() <= 1.0f && v1Var.m39482d() >= 0.0f && v1Var.m39482d() <= 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ boolean m8549x(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !C11935w.m8268O(totalCaptureResult, j)) {
            return false;
        }
        m8561l();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ boolean m8548y(boolean z, long j, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (m8577H()) {
            if (!z || num == null) {
                this.f26398l = true;
                this.f26397k = true;
            } else if (this.f26394h.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.f26398l = true;
                    this.f26397k = true;
                } else if (num.intValue() == 5) {
                    this.f26398l = false;
                    this.f26397k = true;
                }
            }
        }
        if (!this.f26397k || !C11935w.m8268O(totalCaptureResult, j)) {
            if (!this.f26394h.equals(num) && num != null) {
                this.f26394h = num;
            }
            return false;
        }
        m8562k(this.f26398l);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m8547z(long j) {
        if (j == this.f26396j) {
            m8563j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m8580E(boolean z) {
        if (z != this.f26390d) {
            this.f26390d = z;
            if (!this.f26390d) {
                m8563j();
            }
        }
    }

    /* renamed from: F */
    public void m8579F(Rational rational) {
        this.f26391e = rational;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m8578G(int i) {
        this.f26399m = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public AbstractFutureC7576b<C1829h0> m8576I(final C1811g0 g0Var) {
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.e2
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object C;
                C = C11828h2.this.m8582C(g0Var, aVar);
                return C;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m8583B(C2114c.C2115a<C1829h0> aVar, C1811g0 g0Var) {
        if (!this.f26390d) {
            aVar.m38958f(new AbstractC1883m.C1884a("Camera is not active."));
            return;
        }
        Rect x = this.f26387a.m8231x();
        Rational r = m8555r();
        List<MeteringRectangle> u = m8552u(g0Var.m39788c(), this.f26387a.m8281B(), r, x, 1);
        List<MeteringRectangle> u2 = m8552u(g0Var.m39789b(), this.f26387a.m8282A(), r, x, 2);
        List<MeteringRectangle> u3 = m8552u(g0Var.m39787d(), this.f26387a.m8280C(), r, x, 4);
        if (!u.isEmpty() || !u2.isEmpty() || !u3.isEmpty()) {
            m8558o("Cancelled by another startFocusAndMetering()");
            m8557p("Cancelled by another startFocusAndMetering()");
            m8560m();
            this.f26405s = aVar;
            MeteringRectangle[] meteringRectangleArr = f26386u;
            m8559n((MeteringRectangle[]) u.toArray(meteringRectangleArr), (MeteringRectangle[]) u2.toArray(meteringRectangleArr), (MeteringRectangle[]) u3.toArray(meteringRectangleArr), g0Var);
            return;
        }
        aVar.m38958f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m8574K(C2114c.C2115a<Void> aVar) {
        if (this.f26390d) {
            C13639n0.C13640a aVar2 = new C13639n0.C13640a();
            aVar2.m3130o(this.f26399m);
            aVar2.m3129p(true);
            C11502b.C11503a aVar3 = new C11502b.C11503a();
            aVar3.m9553e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            aVar2.m3140e(aVar3.m9555b());
            aVar2.m3142c(new C11830b(aVar));
            this.f26387a.m8250g0(Collections.singletonList(aVar2.m3137h()));
        } else if (aVar != null) {
            aVar.m38958f(new AbstractC1883m.C1884a("Camera is not active."));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m8573L(C2114c.C2115a<AbstractC13672t> aVar, boolean z) {
        if (this.f26390d) {
            C13639n0.C13640a aVar2 = new C13639n0.C13640a();
            aVar2.m3130o(this.f26399m);
            aVar2.m3129p(true);
            C11502b.C11503a aVar3 = new C11502b.C11503a();
            aVar3.m9553e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                aVar3.m9553e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f26387a.m8277F(1)));
            }
            aVar2.m3140e(aVar3.m9555b());
            aVar2.m3142c(new C11829a(aVar));
            this.f26387a.m8250g0(Collections.singletonList(aVar2.m3137h()));
        } else if (aVar != null) {
            aVar.m38958f(new AbstractC1883m.C1884a("Camera is not active."));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m8566g(C11502b.C11503a aVar) {
        int i;
        if (this.f26393g) {
            i = 1;
        } else {
            i = m8556q();
        }
        aVar.m9553e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f26387a.m8276G(i)));
        MeteringRectangle[] meteringRectangleArr = this.f26402p;
        if (meteringRectangleArr.length != 0) {
            aVar.m9553e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f26403q;
        if (meteringRectangleArr2.length != 0) {
            aVar.m9553e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f26404r;
        if (meteringRectangleArr3.length != 0) {
            aVar.m9553e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m8565h(boolean z, boolean z2) {
        if (this.f26390d) {
            C13639n0.C13640a aVar = new C13639n0.C13640a();
            aVar.m3129p(true);
            aVar.m3130o(this.f26399m);
            C11502b.C11503a aVar2 = new C11502b.C11503a();
            if (z) {
                aVar2.m9553e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                aVar2.m9553e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.m3140e(aVar2.m9555b());
            this.f26387a.m8250g0(Collections.singletonList(aVar.m3137h()));
        }
    }

    /* renamed from: i */
    void m8564i(C2114c.C2115a<Void> aVar) {
        m8557p("Cancelled by another cancelFocusAndMetering()");
        m8558o("Cancelled by cancelFocusAndMetering()");
        this.f26406t = aVar;
        m8560m();
        if (m8577H()) {
            m8565h(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f26386u;
        this.f26402p = meteringRectangleArr;
        this.f26403q = meteringRectangleArr;
        this.f26404r = meteringRectangleArr;
        this.f26393g = false;
        final long j0 = this.f26387a.m8246j0();
        if (this.f26406t != null) {
            final int G = this.f26387a.m8276G(m8556q());
            C11935w.AbstractC11938c f2Var = new C11935w.AbstractC11938c() { // from class: q.f2
                @Override // p288q.C11935w.AbstractC11938c
                /* renamed from: a */
                public final boolean mo3810a(TotalCaptureResult totalCaptureResult) {
                    boolean x;
                    x = C11828h2.this.m8549x(G, j0, totalCaptureResult);
                    return x;
                }
            };
            this.f26401o = f2Var;
            this.f26387a.m8235t(f2Var);
        }
    }

    /* renamed from: j */
    void m8563j() {
        m8564i(null);
    }

    /* renamed from: q */
    int m8556q() {
        return this.f26399m != 3 ? 4 : 3;
    }
}
