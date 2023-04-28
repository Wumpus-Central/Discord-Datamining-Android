package androidx.lifecycle;

import androidx.lifecycle.C3028b;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements AbstractC3038j {

    /* renamed from: k */
    private final Object f4415k;

    /* renamed from: l */
    private final C3028b.C3029a f4416l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4415k = obj;
        this.f4416l = C3028b.f4464c.m35786c(obj.getClass());
    }

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
        this.f4416l.m35783a(lifecycleOwner, bVar, this.f4415k);
    }
}
