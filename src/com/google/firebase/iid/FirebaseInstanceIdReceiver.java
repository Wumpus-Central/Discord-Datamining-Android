package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C5474b;
import com.google.firebase.messaging.C5822d0;
import com.google.firebase.messaging.C5841l;
import java.util.concurrent.ExecutionException;
import p350t9.AbstractC13014b;
import p350t9.C13012a;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC13014b {
    /* renamed from: g */
    private static Intent m27333g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // p350t9.AbstractC13014b
    /* renamed from: b */
    protected int mo4741b(Context context, C13012a aVar) {
        try {
            return ((Integer) C5474b.m28897a(new C5841l(context).m27109k(aVar.m4744p()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // p350t9.AbstractC13014b
    /* renamed from: c */
    protected void mo4740c(Context context, Bundle bundle) {
        Intent g = m27333g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C5822d0.m27202A(g)) {
            C5822d0.m27182s(g);
        }
    }
}
