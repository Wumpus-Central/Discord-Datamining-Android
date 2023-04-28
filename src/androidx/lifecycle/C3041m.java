package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m15073d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/g;", "a", "(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/g;", "lifecycleScope", "lifecycle-runtime-ktx_release"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class C3041m {
    /* renamed from: a */
    public static final AbstractC3034g m35771a(LifecycleOwner lifecycleOwner) {
        C9971q.m14633g(lifecycleOwner, "<this>");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C9971q.m14634f(lifecycle, "lifecycle");
        return C3039k.m35772a(lifecycle);
    }
}
