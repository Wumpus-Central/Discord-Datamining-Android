package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements AbstractC3038j {

    /* renamed from: k */
    private final AbstractC3033f[] f4355k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(AbstractC3033f[] fVarArr) {
        this.f4355k = fVarArr;
    }

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
        C3046q qVar = new C3046q();
        for (AbstractC3033f fVar : this.f4355k) {
            fVar.m35774a(lifecycleOwner, bVar, false, qVar);
        }
        for (AbstractC3033f fVar2 : this.f4355k) {
            fVar2.m35774a(lifecycleOwner, bVar, true, qVar);
        }
    }
}
