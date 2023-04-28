package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C5372a;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes5.dex */
final class C5404o implements ComponentCallbacks2C5372a.AbstractC0150a {

    /* renamed from: a */
    final /* synthetic */ C5376c f10195a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5404o(C5376c cVar) {
        this.f10195a = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C5372a.AbstractC0150a
    /* renamed from: a */
    public final void mo20951a(boolean z) {
        Handler handler;
        Handler handler2;
        C5376c cVar = this.f10195a;
        handler = cVar.f10138z;
        handler2 = cVar.f10138z;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
