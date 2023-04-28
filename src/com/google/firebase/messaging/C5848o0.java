package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.C2094a;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p064db.AbstractC6421a;

/* renamed from: com.google.firebase.messaging.o0 */
/* loaded from: classes3.dex */
class C5848o0 {

    /* renamed from: a */
    private final Executor f11601a;

    /* renamed from: b */
    private final Map<String, Task<String>> f11602b = new C2094a();

    /* renamed from: com.google.firebase.messaging.o0$a */
    /* loaded from: classes3.dex */
    interface AbstractC5849a {
        Task<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5848o0(Executor executor) {
        this.f11601a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Task m27091c(String str, Task task) {
        synchronized (this) {
            this.f11602b.remove(str);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public synchronized Task<String> m27092b(final String str, AbstractC5849a aVar) {
        Task<String> task = this.f11602b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task i = aVar.start().mo28864i(this.f11601a, new AbstractC6421a() { // from class: com.google.firebase.messaging.n0
            @Override // p064db.AbstractC6421a
            /* renamed from: a */
            public final Object mo4702a(Task task2) {
                Task c;
                c = C5848o0.this.m27091c(str, task2);
                return c;
            }
        });
        this.f11602b.put(str, i);
        return i;
    }
}
