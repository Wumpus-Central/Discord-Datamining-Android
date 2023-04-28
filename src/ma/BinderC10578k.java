package ma;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p400w9.C13835m;

/* renamed from: ma.k */
/* loaded from: classes3.dex */
final class BinderC10578k extends AbstractBinderC10574g {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f23423a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC10578k(C10569b bVar, TaskCompletionSource taskCompletionSource) {
        this.f23423a = taskCompletionSource;
    }

    @Override // ma.AbstractC10575h
    /* renamed from: y */
    public final void mo12801y(Status status) {
        C13835m.m2549a(status, this.f23423a);
    }
}
