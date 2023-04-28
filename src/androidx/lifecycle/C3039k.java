package androidx.lifecycle;

import androidx.camera.view.C2062h;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10159p2;
import kotlinx.coroutines.C10230y0;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m15073d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/g;", "a", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/g;", "coroutineScope", "lifecycle-runtime-ktx_release"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.k */
/* loaded from: classes.dex */
public final class C3039k {
    /* renamed from: a */
    public static final AbstractC3034g m35772a(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C9971q.m14633g(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.f4359a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, C10159p2.m14110b(null, 1, null).mo3485f0(C10230y0.m13945c().mo4544K0()));
        } while (!C2062h.m39137a(lifecycle.f4359a, null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m35845b();
        return lifecycleCoroutineScopeImpl;
    }
}
