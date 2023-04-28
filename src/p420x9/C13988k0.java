package p420x9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import p384v9.AbstractC13473g;
import p420x9.C14000o;

/* renamed from: x9.k0 */
/* loaded from: classes5.dex */
final class C13988k0 implements AbstractC13473g.AbstractC13474a {

    /* renamed from: a */
    final /* synthetic */ AbstractC13473g f31548a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f31549b;

    /* renamed from: c */
    final /* synthetic */ C14000o.AbstractC14001a f31550c;

    /* renamed from: d */
    final /* synthetic */ AbstractC13998n0 f31551d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13988k0(AbstractC13473g gVar, TaskCompletionSource taskCompletionSource, C14000o.AbstractC14001a aVar, AbstractC13998n0 n0Var) {
        this.f31548a = gVar;
        this.f31549b = taskCompletionSource;
        this.f31550c = aVar;
        this.f31551d = n0Var;
    }

    @Override // p384v9.AbstractC13473g.AbstractC13474a
    /* renamed from: a */
    public final void mo2080a(Status status) {
        if (status.m29108z()) {
            this.f31549b.m28900c(this.f31550c.mo2064a(this.f31548a.await(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f31549b.m28901b(C13954b.m2200a(status));
    }
}
