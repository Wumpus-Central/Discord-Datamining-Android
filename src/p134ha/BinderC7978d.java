package p134ha;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p400w9.C13835m;
import qa.AbstractBinderC12095u0;

/* renamed from: ha.d */
/* loaded from: classes5.dex */
final class BinderC7978d extends AbstractBinderC12095u0 {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f17192a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC7978d(C7975a aVar, TaskCompletionSource taskCompletionSource) {
        this.f17192a = taskCompletionSource;
    }

    @Override // qa.AbstractC12089r0
    /* renamed from: w */
    public final void mo7856w(Status status, PendingIntent pendingIntent) {
        C13835m.m2548b(status, pendingIntent, this.f17192a);
    }
}
