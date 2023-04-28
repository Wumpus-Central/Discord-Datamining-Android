package p134ha;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p400w9.C13835m;
import qa.AbstractBinderC12095u0;

/* renamed from: ha.e */
/* loaded from: classes5.dex */
final class BinderC7979e extends AbstractBinderC12095u0 {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f17193a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC7979e(C7975a aVar, TaskCompletionSource taskCompletionSource) {
        this.f17193a = taskCompletionSource;
    }

    @Override // qa.AbstractC12089r0
    /* renamed from: w */
    public final void mo7856w(Status status, PendingIntent pendingIntent) {
        C13835m.m2548b(status, pendingIntent, this.f17193a);
    }
}
