package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.CancellableContinuation;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m15073d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$b;", "event", "", "c", "lifecycle-runtime-ktx_release"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* loaded from: classes.dex */
public final class C3026xfdb59cc4 implements AbstractC3038j {

    /* renamed from: k */
    final /* synthetic */ Lifecycle.State f4460k;

    /* renamed from: l */
    final /* synthetic */ Lifecycle f4461l;

    /* renamed from: m */
    final /* synthetic */ CancellableContinuation<Object> f4462m;

    /* renamed from: n */
    final /* synthetic */ Function0<Object> f4463n;

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner source, Lifecycle.EnumC3010b event) {
        Object obj;
        C9971q.m14633g(source, "source");
        C9971q.m14633g(event, "event");
        if (event == Lifecycle.EnumC3010b.m35847d(this.f4460k)) {
            this.f4461l.mo35842c(this);
            CancellableContinuation<Object> cancellableContinuation = this.f4462m;
            Function0<Object> function0 = this.f4463n;
            try {
                C11090s.C11091a aVar = C11090s.f24606l;
                obj = C11090s.m10940b(function0.invoke());
            } catch (Throwable th2) {
                C11090s.C11091a aVar2 = C11090s.f24606l;
                obj = C11090s.m10940b(C11093t.m10931a(th2));
            }
            cancellableContinuation.resumeWith(obj);
        } else if (event == Lifecycle.EnumC3010b.ON_DESTROY) {
            this.f4461l.mo35842c(this);
            CancellableContinuation<Object> cancellableContinuation2 = this.f4462m;
            C11090s.C11091a aVar3 = C11090s.f24606l;
            cancellableContinuation2.resumeWith(C11090s.m10940b(C11093t.m10931a(new C3035h())));
        }
    }
}
