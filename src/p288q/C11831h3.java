package p288q;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.AbstractC1883m;
import androidx.camera.core.C1915r1;
import androidx.camera.core.impl.utils.C1869r;
import androidx.concurrent.futures.C2114c;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import p120gc.AbstractFutureC7576b;
import p288q.C11935w;
import p308r.C12267f0;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.h3 */
/* loaded from: classes.dex */
public final class C11831h3 {

    /* renamed from: a */
    private final C11935w f26411a;

    /* renamed from: b */
    private final MutableLiveData<Integer> f26412b;

    /* renamed from: c */
    private final boolean f26413c;

    /* renamed from: d */
    private final Executor f26414d;

    /* renamed from: e */
    private boolean f26415e;

    /* renamed from: f */
    C2114c.C2115a<Void> f26416f;

    /* renamed from: g */
    boolean f26417g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11831h3(C11935w wVar, C12267f0 f0Var, Executor executor) {
        boolean z;
        this.f26411a = wVar;
        this.f26414d = executor;
        Boolean bool = (Boolean) f0Var.m7252a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f26413c = z;
        this.f26412b = new MutableLiveData<>(0);
        wVar.m8235t(new C11935w.AbstractC11938c() { // from class: q.f3
            @Override // p288q.C11935w.AbstractC11938c
            /* renamed from: a */
            public final boolean mo3810a(TotalCaptureResult totalCaptureResult) {
                boolean i;
                i = C11831h3.this.m8538i(totalCaptureResult);
                return i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m8539h(final boolean z, final C2114c.C2115a aVar) {
        this.f26414d.execute(new Runnable() { // from class: q.g3
            @Override // java.lang.Runnable
            public final void run() {
                C11831h3.this.m8540g(aVar, z);
            }
        });
        return "enableTorch: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ boolean m8538i(TotalCaptureResult totalCaptureResult) {
        boolean z;
        if (this.f26416f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if (num == null || num.intValue() != 2) {
                z = false;
            } else {
                z = true;
            }
            if (z == this.f26417g) {
                this.f26416f.m38961c(null);
                this.f26416f = null;
            }
        }
        return false;
    }

    /* renamed from: k */
    private <T> void m8536k(MutableLiveData<T> mutableLiveData, T t) {
        if (C1869r.m39613b()) {
            mutableLiveData.mo35726o(t);
        } else {
            mutableLiveData.mo35815m(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractFutureC7576b<Void> m8543d(final boolean z) {
        if (!this.f26413c) {
            C1915r1.m39527a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return C14186f.m1423f(new IllegalStateException("No flash unit"));
        }
        m8536k(this.f26412b, Integer.valueOf(z ? 1 : 0));
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.e3
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object h;
                h = C11831h3.this.m8539h(z, aVar);
                return h;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m8540g(C2114c.C2115a<Void> aVar, boolean z) {
        if (!this.f26413c) {
            if (aVar != null) {
                aVar.m38958f(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f26415e) {
            m8536k(this.f26412b, 0);
            if (aVar != null) {
                aVar.m38958f(new AbstractC1883m.C1884a("Camera is not active."));
            }
        } else {
            this.f26417g = z;
            this.f26411a.m8232w(z);
            m8536k(this.f26412b, Integer.valueOf(z ? 1 : 0));
            C2114c.C2115a<Void> aVar2 = this.f26416f;
            if (aVar2 != null) {
                aVar2.m38958f(new AbstractC1883m.C1884a("There is a new enableTorch being set"));
            }
            this.f26416f = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public LiveData<Integer> m8541f() {
        return this.f26412b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m8537j(boolean z) {
        if (this.f26415e != z) {
            this.f26415e = z;
            if (!z) {
                if (this.f26417g) {
                    this.f26417g = false;
                    this.f26411a.m8232w(false);
                    m8536k(this.f26412b, 0);
                }
                C2114c.C2115a<Void> aVar = this.f26416f;
                if (aVar != null) {
                    aVar.m38958f(new AbstractC1883m.C1884a("Camera is not active."));
                    this.f26416f = null;
                }
            }
        }
    }
}
