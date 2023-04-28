package p350t9;

import android.os.Looper;
import android.os.Message;
import p262oa.HandlerC11246f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t9.e */
/* loaded from: classes5.dex */
public final class HandlerC13020e extends HandlerC11246f {

    /* renamed from: a */
    final /* synthetic */ C13016c f29307a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC13020e(C13016c cVar, Looper looper) {
        super(looper);
        this.f29307a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C13016c.m4732d(this.f29307a, message);
    }
}
