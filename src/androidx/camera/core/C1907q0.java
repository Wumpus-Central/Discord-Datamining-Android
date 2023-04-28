package androidx.camera.core;

import p390w.AbstractC13635m1;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.q0 */
/* loaded from: classes.dex */
public final class C1907q0 extends AbstractC1903p0 {

    /* renamed from: androidx.camera.core.q0$a */
    /* loaded from: classes.dex */
    class C1908a implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ ImageProxy f1939a;

        C1908a(ImageProxy imageProxy) {
            this.f1939a = imageProxy;
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            this.f1939a.close();
        }
    }

    @Override // androidx.camera.core.AbstractC1903p0
    /* renamed from: d */
    ImageProxy mo39535d(AbstractC13635m1 m1Var) {
        return m1Var.mo3153g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.AbstractC1903p0
    /* renamed from: g */
    public void mo39534g() {
    }

    @Override // androidx.camera.core.AbstractC1903p0
    /* renamed from: p */
    void mo39533p(ImageProxy imageProxy) {
        C14186f.m1427b(m39560e(imageProxy), new C1908a(imageProxy), C13905a.m2339a());
    }
}
