package p288q;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.camera.core.AbstractC1801d3;
import androidx.camera.core.AbstractC1883m;
import androidx.concurrent.futures.C2114c;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import p120gc.AbstractFutureC7576b;
import p272p.C11502b;
import p288q.C11935w;
import p308r.C12267f0;
import p431y.C14186f;
import p451z.AbstractC14503f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.k3 */
/* loaded from: classes.dex */
public final class C11862k3 {

    /* renamed from: a */
    private final C11935w f26487a;

    /* renamed from: b */
    private final Executor f26488b;

    /* renamed from: c */
    private final C11870l3 f26489c;

    /* renamed from: d */
    private final MutableLiveData<AbstractC1801d3> f26490d;

    /* renamed from: e */
    final AbstractC11864b f26491e;

    /* renamed from: f */
    private boolean f26492f = false;

    /* renamed from: g */
    private C11935w.AbstractC11938c f26493g = new C11863a();

    /* renamed from: q.k3$a */
    /* loaded from: classes.dex */
    class C11863a implements C11935w.AbstractC11938c {
        C11863a() {
        }

        @Override // p288q.C11935w.AbstractC11938c
        /* renamed from: a */
        public boolean mo3810a(TotalCaptureResult totalCaptureResult) {
            C11862k3.this.f26491e.mo8199a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.k3$b */
    /* loaded from: classes.dex */
    public interface AbstractC11864b {
        /* renamed from: a */
        void mo8199a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        void mo8198b(float f, C2114c.C2115a<Void> aVar);

        /* renamed from: c */
        float mo8197c();

        /* renamed from: d */
        void mo8196d();

        /* renamed from: e */
        float mo8195e();

        /* renamed from: f */
        Rect mo8194f();

        /* renamed from: g */
        void mo8193g(C11502b.C11503a aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11862k3(C11935w wVar, C12267f0 f0Var, Executor executor) {
        this.f26487a = wVar;
        this.f26488b = executor;
        AbstractC11864b d = m8436d(f0Var);
        this.f26491e = d;
        C11870l3 l3Var = new C11870l3(d.mo8195e(), d.mo8197c());
        this.f26489c = l3Var;
        l3Var.m8421f(1.0f);
        this.f26490d = new MutableLiveData<>(AbstractC14503f.m305e(l3Var));
        wVar.m8235t(this.f26493g);
    }

    /* renamed from: d */
    private static AbstractC11864b m8436d(C12267f0 f0Var) {
        if (m8432h(f0Var)) {
            return new C11794c(f0Var);
        }
        return new C11945x1(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static AbstractC1801d3 m8434f(C12267f0 f0Var) {
        AbstractC11864b d = m8436d(f0Var);
        C11870l3 l3Var = new C11870l3(d.mo8195e(), d.mo8197c());
        l3Var.m8421f(1.0f);
        return AbstractC14503f.m305e(l3Var);
    }

    /* renamed from: h */
    private static boolean m8432h(C12267f0 f0Var) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 30) {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            if (f0Var.m7252a(key) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Object m8430j(final AbstractC1801d3 d3Var, final C2114c.C2115a aVar) {
        this.f26488b.execute(new Runnable() { // from class: q.j3
            @Override // java.lang.Runnable
            public final void run() {
                C11862k3.this.m8431i(aVar, d3Var);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m8431i(C2114c.C2115a<Void> aVar, AbstractC1801d3 d3Var) {
        AbstractC1801d3 e;
        if (!this.f26492f) {
            synchronized (this.f26489c) {
                this.f26489c.m8421f(1.0f);
                e = AbstractC14503f.m305e(this.f26489c);
            }
            m8426n(e);
            aVar.m38958f(new AbstractC1883m.C1884a("Camera is not active."));
            return;
        }
        m8426n(d3Var);
        this.f26491e.mo8198b(d3Var.mo306d(), aVar);
        this.f26487a.m8246j0();
    }

    /* renamed from: n */
    private void m8426n(AbstractC1801d3 d3Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f26490d.mo35726o(d3Var);
        } else {
            this.f26490d.mo35815m(d3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m8437c(C11502b.C11503a aVar) {
        this.f26491e.mo8193g(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Rect m8435e() {
        return this.f26491e.mo8194f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public LiveData<AbstractC1801d3> m8433g() {
        return this.f26490d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m8429k(boolean z) {
        AbstractC1801d3 e;
        if (this.f26492f != z) {
            this.f26492f = z;
            if (!z) {
                synchronized (this.f26489c) {
                    this.f26489c.m8421f(1.0f);
                    e = AbstractC14503f.m305e(this.f26489c);
                }
                m8426n(e);
                this.f26491e.mo8196d();
                this.f26487a.m8246j0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public AbstractFutureC7576b<Void> m8428l(float f) {
        final AbstractC1801d3 e;
        synchronized (this.f26489c) {
            try {
                this.f26489c.m8421f(f);
                e = AbstractC14503f.m305e(this.f26489c);
            } catch (IllegalArgumentException e2) {
                return C14186f.m1423f(e2);
            }
        }
        m8426n(e);
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.i3
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object j;
                j = C11862k3.this.m8430j(e, aVar);
                return j;
            }
        });
    }
}
