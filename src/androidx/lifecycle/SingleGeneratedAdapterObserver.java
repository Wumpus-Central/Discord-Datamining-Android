package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements AbstractC3038j {

    /* renamed from: k */
    private final AbstractC3033f f4453k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleGeneratedAdapterObserver(AbstractC3033f fVar) {
        this.f4453k = fVar;
    }

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
        this.f4453k.m35774a(lifecycleOwner, bVar, false, null);
        this.f4453k.m35774a(lifecycleOwner, bVar, true, null);
    }
}
