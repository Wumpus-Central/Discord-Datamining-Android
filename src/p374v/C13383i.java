package p374v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.AbstractC1807f0;
import p272p.C11502b;
import p390w.AbstractC13662r0;

/* renamed from: v.i */
/* loaded from: classes.dex */
public final class C13383i<T> {

    /* renamed from: a */
    AbstractC1807f0<T> f29963a;

    public C13383i(AbstractC1807f0<T> f0Var) {
        this.f29963a = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <ValueT> C13383i<T> m3782a(CaptureRequest.Key<ValueT> key, ValueT valuet) {
        this.f29963a.mo3781a().mo3003E(C11502b.m9564F(key), AbstractC13662r0.EnumC13665c.ALWAYS_OVERRIDE, valuet);
        return this;
    }
}
