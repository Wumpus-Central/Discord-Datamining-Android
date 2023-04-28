package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC5829f1;
import p064db.AbstractC6424d;

/* renamed from: com.google.firebase.messaging.c1 */
/* loaded from: classes3.dex */
class BinderC5819c1 extends Binder {

    /* renamed from: a */
    private final AbstractC5820a f11559a;

    /* renamed from: com.google.firebase.messaging.c1$a */
    /* loaded from: classes3.dex */
    interface AbstractC5820a {
        /* renamed from: a */
        Task<Void> mo27208a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5819c1(AbstractC5820a aVar) {
        this.f11559a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m27209c(final ServiceConnectionC5829f1.C5830a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f11559a.mo27208a(aVar.f11580a).mo28870c(new ExecutorC5827f(), new AbstractC6424d() { // from class: com.google.firebase.messaging.b1
                @Override // p064db.AbstractC6424d
                /* renamed from: a */
                public final void mo4743a(Task task) {
                    ServiceConnectionC5829f1.C5830a.this.m27133d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
